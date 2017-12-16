#!groovy

pipeline {
    agent any

    stages {
        stage("Compile") {
            steps {
                checkout scm
                wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'xterm']) {
                    sh 'sbt compile'
                }
            }
        }

        stage("Test") {
            steps {
                wrap([$class: 'AnsiColorBuildWrapper', 'colorMapName': 'xterm']) {
                    sh 'sbt test'
                }
            }
        }
    }
}
