#!groovy

pipeline {
    stages {
        stage("Compile") {
            steps {
                checkout scm
                sh 'sbt compile'
            }
        }

        stage("Test") {
            steps {
                sh 'sbt test'
            }
        }
    }
}
