## config server

1. git 을 이용한
   ```yml
   spring.cloud.config.server.git.url=[repository]
   ```
2. file 을 이용한
   ```yml
   spring.profiles.active:native
   spring.cloud.config.server.native.searchLocations=file:./config
   spring.cloud.config.server.native.searchLocations=classpath:/config
   ```
   filePath
   resources/config/

   localhost:8889/example/dev
   localhost:8889/example/prod

3. db 를 이용한
   ```yml
   spring.cloud.config.label=master
   spring.cloud.config.server.jdbc.sql=SELECT KEY, VALUE FROM PROPERTIES WHERE APPLICATION=? and PROFILE=? and LABEL=?
   ```