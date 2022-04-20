pipeline {
  agent any
  stages {
    stage('Check version') {
      agent any
      steps {
        bat 'mvn -version'
      }
    }

    stage('the end') {
      steps {
        echo 'Finito'
      }
    }

  }
}