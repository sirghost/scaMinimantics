package br.ufrgs.inf

import scala.io.Source

class BuildProfiles{

  var idT:Int = 0;
  var idC:Int = 0;

  def readInputFile(filename: String) = {
    Source.fromFile(filename).foreach{
      print
    }
  }

  def expected(cw1: Double, cw2: Double, n: Double): Double = {
    (cw1 * cw2) / n
  }

  def prodLog(a: Double, b: Double): Double = {
    //a != 0 ? a * Math.log(b) : 0
    a * Math.log(b)
  }

  def calculateAndPrintAM(w1: String, idw1:Int,
                           w2: String, idw2: Int,
                           cw1w2: Double, cw1: Double, cw2: Double,
                           tEntropy: Double, cEntropy: Double) = {

  }

  //Map?
  def calculateEntropy(total: Double, distribution:String): Double = {
    0.0
  }

  def calculateAmsSerial(wcT: WordCount, keyT: String) = {

  }

  def insertIntoIndexT(w1: String, w2: String, count: Double) = {

  }

  def insertIntoIndexC(w1: String, w2: String, count: Double) = {

  }

  def printSG() = {

  }
}

object BuildProfiles {

  def main(args: Array[String]){
    println("Running Build Profiles")
    val bp = new BuildProfiles;
    bp.readInputFile("/home/jkmvsanchez/agathon/msc/nlp/minimantics/src/mini.2.s.filter.t4.c4.tc2.u")
  }
}