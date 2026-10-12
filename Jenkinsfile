
pipeline {
    agent any

   
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn  compile'
            }
        }

        stage('Parallel CI Tasks') {
            parallel {
                stage('Unit Tests') {
                    steps {
                        sh 'mvn  test'
                    }
                }

               

                stage('Code Analysis') {
                    steps {
                        sh 'mvn -B pmd:pmd'
                    }
                }
            }
        }
    }
}
