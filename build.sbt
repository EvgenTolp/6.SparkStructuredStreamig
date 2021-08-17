name := "Streaming7"

version := "0.1"

scalaVersion := "2.13.6"

lazy val sparkVersion = "3.1.1"
lazy val kafkaVersion = "2.7.0"

libraryDependencies ++= Seq(
  "com.typesafe"      % "config"      % "1.4.0",
  "org.apache.spark" %% "spark-sql" % "3.0.1" % Provided,
  "org.apache.spark" %% "spark-mllib" % "3.1.1" % Provided,
  "org.apache.spark"  % "spark-sql-kafka-0-10_2.12" % sparkVersion,
  "org.apache.kafka"  % "kafka-clients"             % kafkaVersion
)
