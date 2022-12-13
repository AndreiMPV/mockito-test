#!groovy

pipeline {
    agent {
        docker { image 'gradle:6.9.1-jdk8' }
    }

    stages {
        stage('Checkout') {
            steps {
                withCredentials([gitUsernamePassword(credentialsId: 'git-clone-credits',
                                 gitToolName: 'git-tool')]) {
                    sh 'git clone https://github.com/AndreiMPV/mockito-test.git'
                }
            }
        }
        stage('Build') {
            steps {
                sh "ll"
                sh "gradle -version"
                sh "cd /var/lib/jenkins/workspace/docker-agent-pipeline"
                sh "gradle build"
           }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}