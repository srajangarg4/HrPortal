pipeline {
    agent any
    stages {
        stage('Clean and Install') {
            steps{
                withMaven(maven : 'maven_3_8_1') {
                    sh 'mvn clean install'
                }
            }
        }
    }
}