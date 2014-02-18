name := "hello"

version := "1.0"

scalaVersion := "2.10.3"

resolvers ++= Seq(
    "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
      "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
    )

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test",
  "org.scala-saddle" %% "saddle-core" % "1.3.+",
  "joda-time" % "joda-time" % "2.3",
  "org.joda" % "joda-convert" % "1.2",
  "com.novocode" % "junit-interface" % "0.9" % "test"
  // (OPTIONAL) "org.scala-saddle" %% "saddle-hdf5" % "1.3.+"
  )
