
lazy val lib = Project("lib", file("./lib"))

lazy val child = Project("child", file("."))
  .dependsOn(lib)

