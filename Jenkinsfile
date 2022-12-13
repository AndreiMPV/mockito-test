#!groovy

// Build Scheduler Engine

//library identifier: "jenkins-pipeline@${scm.branches[0]}", changelog: false


LABEL = env.LABEL ?: 'docker-java-8'

// SCM (Git)
// REPO = env.REPO ?: 'eb/ontimeworks.git'
// BRANCH = env.BRANCH ?: 'develop'
// GIT_CREDENTIALS_ID = env.GIT_CREDENTIALS_ID ?: ''
// GIT_TOOL = env.GIT_TOOL ?: ''

// // Artifacts
// MAJOR_VERSION = env.MAJOR_VERSION ?: 'dev'
// MINOR_VERSION = env.MINOR_VERSION ?: env.BUILD_NUMBER
// ARTIFACT_VERSION = env.ARTIFACT_VERSION ?:
//         "${MAJOR_VERSION == 'dev' ? 'dev' : 'r' + MAJOR_VERSION}.${MINOR_VERSION}"
// EB_ARTIFACTORY_REPO = env.EB_ARTIFACTORY_REPO ?: 'eb-zip-ci-local'

// def gitRevisionHash // stores Git revision hash

// //Misc
// RECIPIENT_LIST = env.RECIPIENT_LIST ?: ''

// BUILD_METADATA = [:]

// assert REPO : 'REPO param is required'
// assert BRANCH : 'BRANCH param is required'
// assert GIT_CREDENTIALS_ID : 'GIT_CREDENTIALS_ID param is required'

pipeline {
    agent {
        docker { image 'gradle:6.9.1-jdk8' }
    }

    stages {
        stage('Build') {
            steps {
                script {
                    gradle 'build'
                }
            }
        }
    }
}