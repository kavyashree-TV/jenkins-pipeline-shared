
@Library('jenkins-shared-lib') _  // Load the shared library by name

pipeline {
    agent any
    stages {
        stage('Greeting') {
            steps {
                hello('Jenkins User')  // Calls hello.groovy from vars/
            }
        }
    }
}
