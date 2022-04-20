pipeline {
  agent any
  stages {
    stage('Check version') {
      agent any
      steps {
        echo 'First Stage started'
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