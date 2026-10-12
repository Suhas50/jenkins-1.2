
pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

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

                stage('Integration Tests') {
                    steps {
                        sh 'mvn -B -Dtest=AppIntegrationTest test'
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
