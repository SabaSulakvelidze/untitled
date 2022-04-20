pipeline {
  agent any
  stages {
    stage('Check version') {
      agent any
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