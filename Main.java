import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

class Main {
   public static void main(final String[] a) throws IOException, InterruptedException {
      System.out.println("Hello world from Java!");
      final InputStream input = Main.class.getResourceAsStream("/out/app");
      File temp = File.createTempFile("app", null);
      temp.deleteOnExit();
      Files.copy(input, temp.toPath(), StandardCopyOption.REPLACE_EXISTING);
      temp.setExecutable(true);
      input.close();

      String[] args = {temp.getAbsolutePath()};
      ProcessBuilder pb = new ProcessBuilder(args);
      pb.inheritIO();
      Process process = pb.start();
      System.exit(process.waitFor());
   }
}