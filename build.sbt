name := "slick-codegen-sample"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.3" ,
  "mysql" % "mysql-connector-java" % "5.1.38",
  "com.typesafe.slick" %% "slick-codegen" % "3.2.3",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)