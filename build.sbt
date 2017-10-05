name := """e-diario"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.6"
libraryDependencies += javaJdbc
// https://mvnrepository.com/artifact/org.postgresql/postgresql
libraryDependencies += "org.postgresql" % "postgresql" % "9.4-1200-jdbc41"
TwirlKeys.templateImports += "modelos.InfoUsuario"
TwirlKeys.templateImports += "modelos.UsuarioLogin"
