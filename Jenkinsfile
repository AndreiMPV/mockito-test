#!groovy

pipeline {
    agent {
        docker { image 'amazoncorretto:8u352' }
    }

    stages {
        stage('Build') {
            steps {
                withCredentials([gitUsernamePassword(credentialsId: 'git-clone-credits',
                                 gitToolName: 'git-tool')]) {
                    sh 'git clone https://github.com/AndreiMPV/mockito-test.git'
                    sh 'java -version'
                    sh 'gdale -version'
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