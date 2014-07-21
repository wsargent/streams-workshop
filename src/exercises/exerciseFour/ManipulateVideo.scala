package exerciseFour

import akka.actor.ActorSystem
import akka.stream.MaterializerSettings
import video.Frame
import org.reactivestreams.api.Producer
import java.io.File
import akka.stream.scaladsl.Flow

object ManipulateVideo {

  /**
   * use:
   * sbt 'runMain sample.stream.ManipulateVideo file.mp4'
   *
   */
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    val settings = MaterializerSettings()

    // ------------
    // EXERCISE 4.2
    // ------------
    // Fill in the code necessary to create a flow dsl from a screen capture and then add a a transform
    // that adds movement to the stream.

    // TODO - Your code here to consume and manipulate the video stream in a flow dsl.

  }
}