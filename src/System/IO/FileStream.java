package System.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Provides a Stream for a file, supporting both synchronous and asynchronous read and write operations.
 */
public class FileStream
{
    /**
     * Private instance to hold a temporary file
     */
    private File _file;

    /**
     * Creates a new object reference for filestream usage
     * @param file
     */
    public FileStream(File file)
    {
        this._file = file;
    }

    /**
     * Reads the file given by the constructor
     * @return
     */
    public String Read()
    {
        StringBuilder sb = new StringBuilder();

        try ( FileInputStream fis = new FileInputStream(this._file))
        {
            int content;
            while ((content = fis.read()) != -1)
            {
                System.out.print((char) content);
                sb.append( (char) content);
            }

        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

        return sb.toString();
    }

    /**
     * Writes to a given file with the given content
     * @param content
     */
    public void Write(String content)
    {
        try (FileOutputStream fop = new FileOutputStream(this._file))
        {
            // if file doesn't exists, then create it
            if (!this._file.exists())
                this._file.createNewFile();

            // get the content in bytes
            byte[] contentInBytes = content.getBytes();

            fop.write(contentInBytes);
            fop.flush();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
