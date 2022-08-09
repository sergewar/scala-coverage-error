name := "scala-scoverage-error"

organization := "sss"

version := "1"

scalaVersion := "3.2.0-RC3"

scalacOptions := Seq(
  "-coverage-out:foo"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.13" % Test,
  "eu.timepit" %% "refined" % "0.10.1",
  "eu.timepit" %% "refined-scalacheck" % "0.10.1",
  "eu.timepit" %% "refined-cats" % "0.10.1"
)

//coverageEnabled := true
//coverageDataDir := target.value / "coverage"
