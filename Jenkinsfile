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
                    sh 'git config --system core.autocrlf=false'
                    sh 'git clone https://github.com/AndreiMPV/mockito-test.git'
                    sh "gradle -version"
                    sh "gradle build"
                }
            }
        }
//         stage('Build') {
//             steps {
//                 sh "gradle -version"
//                 sh "gradle build"
//            }
//         }
    }
    post {
        always {
            cleanWs()
        }
    }
}