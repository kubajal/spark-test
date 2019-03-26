package main.sparktest

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession


object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "/usr/lib/spark/README.md" // Should be some file on your system
    val conf = new SparkConf().setAppName("Spark test")
    val sc = new SparkContext(conf)
    val sparkSession = SparkSession
      .builder()
      .appName("spark-test")
      .getOrCreate()

    val df = sparkSession
      .read
      .option("header", "true")
      .option("mode", "DROPMALFORMED")
      .csv("/home/kuba_jal/test_data.csv")

    val numFLs = df.filter(c => c.get(2) == "FL").count()
    println("Lines with a: %s".format(numFLs))
  }
}