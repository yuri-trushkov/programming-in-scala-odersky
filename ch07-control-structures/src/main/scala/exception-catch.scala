import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException


val file = new FileReader("exception-catch.scala")

try {
    
} catch {
  case ex: FileNotFoundException => // Handle missing file
  case ex: IOException => // Handle other I/O error
} finally {
  file.close()
}
