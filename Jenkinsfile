#!groovy

pipeline {
    agent {
        docker { image 'gradle:6.9.1-jdk8' }
    }

    stages {
        stage('Checkout') {
            steps {
                sh "gradle -version"
                sh "git clone git@github.com:AndreiMPV/mockito-test.git"
            }
        }
        stage('Build') {
            steps {
                script {
                    gradle 'build'
                }
            }
        }
    }
}