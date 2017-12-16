
lazy val child = ProjectRef(file("./child"), "child")

lazy val parent = Project("parent", file("./"))
  .dependsOn(child)

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % Test,
  "org.mockito" % "mockito-core" % "1.9.5" % Test
)
