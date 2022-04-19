pipeline {
  agent any
  stages {
    stage('Check maven version') {
      parallel {
        stage('Check maven version') {
          steps {
            sh 'mvn --version'
          }
        }

        stage('Build with Maven') {
          steps {
            sh 'mvn deploy'
          }
        }

      }
    }

    stage('') {
      steps {
        echo 'Finito'
      }
    }

  }
}