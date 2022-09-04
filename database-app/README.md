# learn-spring-native

Build app

```
mvn clean install
```

Build image uisng JIB (this will build using local docker)

```
mvn clean package jib:dockerBuild
mvn -s ~/.m2/settings_old.xml -Dmaven.test.skip=true package jib:dockerBuild
```

Spin up DB
```
docker-compose up -d mysql
```

