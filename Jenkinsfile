#!groovy

pipeline {
    stages {
        stage("Compile") {
            checkout scm
            sh 'sbt compile'
        }

        stage("Test") {
            sh 'sbt test'
        }
    }
}
