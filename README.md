# jenkins-shared-library
jenkins-shared-library


```Jenkinsfile
library(
  identifier: 'jenkins-shared-library@master',
  retriever: modernSCM(
    [
      $class: 'GitSCMSource',
      remote: 'https://github.com/whiteCcinn/jenkins-shared-library.git'
    ]
  )
)

pipeline {
  agent any
  stages {
    stage('Where is Jenkins Shared Library cloned') {
      steps {
        script {
          sh 'pwd'
          sh 'ls -la ../'
          log.info 'Starting'
        }
      }
    }

  }
}

```