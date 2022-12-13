#!groovy

pipeline {
    agent {
        docker { image 'pavlinikdoker/am-8-jenkins:latest' }
    }

    stages {
        stage('Build') {
            steps {
                withCredentials([gitUsernamePassword(credentialsId: 'git-clone-credits',
                                 gitToolName: 'git-tool')]) {
                    sh 'git clone https://github.com/AndreiMPV/mockito-test.git'
                    sh 'java -version'
                    sh 'gradle -version'
                    sh "./gradlew build -s"
                }
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}