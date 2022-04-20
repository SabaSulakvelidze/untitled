pipeline {
  agent any
  stages {
    stage('Check version') {
      steps {
        sh 'mvn --version'
      }
    }

    stage('the end') {
      steps {
        echo 'Finito'
      }
    }

  }
}