This file is a merged representation of a subset of the codebase, containing files not matching ignore patterns, combined into a single document by Repomix.

# File Summary

## Purpose
This file contains a packed representation of a subset of the repository's contents that is considered the most important context.
It is designed to be easily consumable by AI systems for analysis, code review,
or other automated processes.

## File Format
The content is organized as follows:
1. This summary section
2. Repository information
3. Directory structure
4. Repository files (if enabled)
5. Multiple file entries, each consisting of:
  a. A header with the file path (## File: path/to/file)
  b. The full contents of the file in a code block

## Usage Guidelines
- This file should be treated as read-only. Any changes should be made to the
  original repository files, not this packed version.
- When processing this file, use the file path to distinguish
  between different files in the repository.
- Be aware that this file may contain sensitive information. Handle it with
  the same level of security as you would the original repository.

## Notes
- Some files may have been excluded based on .gitignore rules and Repomix's configuration
- Binary files are not included in this packed representation. Please refer to the Repository Structure section for a complete list of file paths, including binary files
- Files matching these patterns are excluded: **/target/**, **/node_modules/**, **/.git/**, **/mvnw*, **/pom.xml.tag, **/HELP.md, **/package-lock.json, **/generated-sources/**, **/.class, **/maven-archiver/**, **/maven-status/**
- Files matching patterns in .gitignore are excluded
- Files matching default ignore patterns are excluded
- Files are sorted by Git change count (files with more changes are at the bottom)

# Directory Structure
```
api-gateway/
  .mvn/
    wrapper/
      maven-wrapper.properties
  src/
    main/
      java/
        com/
          catalog/
            apigateway/
              config/
                SecurityConfig.java
              filter/
                AuthenticationFilter.java
              util/
                JwtUtil.java
              ApiGatewayApplication.java
      resources/
        application.yml
        logback-spring.xml
    test/
      java/
        com/
          catalog/
            apigateway/
              ApiGatewayApplicationTests.java
  .gitattributes
  .gitignore
  Dockerfile
  mvnw
  mvnw.cmd
  pom.xml
auth-service/
  .mvn/
    wrapper/
      maven-wrapper.properties
  src/
    main/
      java/
        com/
          catalog/
            authservice/
              config/
                AuthConfig.java
                CustomUserDetailsService.java
                OpenApiConfig.java
              controller/
                AuthController.java
              dto/
                AuthRequest.java
                AuthResponse.java
                ErrorResponse.java
                UserResponse.java
              entity/
                UserCredential.java
              exception/
                GlobalExceptionHandler.java
              repository/
                UserCredentialRepository.java
              service/
                AuthService.java
                AuthServiceImpl.java
              util/
                JwtUtil.java
              AuthServiceApplication.java
      resources/
        application.yml
        logback-spring.xml
    test/
      java/
        com/
          catalog/
            authservice/
              repository/
                UserCredentialRepositoryTest.java
              service/
                AuthServiceImplTest.java
              AuthServiceApplicationTests.java
  .gitattributes
  .gitignore
  Dockerfile
  mvnw
  mvnw.cmd
  pom.xml
developer-collection-service/
  .mvn/
    wrapper/
      maven-wrapper.properties
  src/
    main/
      java/
        com/
          catalog/
            developercollectionservice/
              client/
                CustomFeignErrorDecoder.java
                ResourceClient.java
              config/
                OpenApiConfig.java
              controller/
                CollectionController.java
                DeveloperController.java
              dto/
                CollectionItemResponse.java
                CollectionRequest.java
                DeveloperCollectionResponse.java
                DeveloperRequest.java
                DeveloperResponse.java
                ErrorResponse.java
                ResourceCatalogResponse.java
              entity/
                CollectionItem.java
                Developer.java
              exception/
                GlobalExceptionHandler.java
              mapper/
                DeveloperMapper.java
              repository/
                CollectionItemRepository.java
                DeveloperRepository.java
              service/
                CollectionCommandService.java
                CollectionQueryService.java
                DeveloperCommandService.java
                DeveloperQueryService.java
              DeveloperCollectionServiceApplication.java
      resources/
        application.yml
        logback-spring.xml
    test/
      java/
        com/
          catalog/
            developercollectionservice/
              repository/
                DeveloperRepositoryTest.java
              service/
                DeveloperCommandServiceTest.java
                DeveloperQueryServiceTest.java
              DeveloperCollectionServiceApplicationTests.java
  .gitattributes
  .gitignore
  Dockerfile
  mvnw
  mvnw.cmd
  pom.xml
frontend-service/
  public/
    favicon.ico
  src/
    api/
      axiosInstance.ts
    assets/
      labels.ts
    components/
      header/
        index.tsx
      ui/
        Primitives.tsx
      CustomSider.tsx
      index.ts
    constants/
      texts.ts
    contexts/
      color-mode/
        index.tsx
    interfaces/
      types.ts
    pages/
      categories/
        create.tsx
        edit.tsx
        list.tsx
      collections/
        create.tsx
        edit.tsx
        list.tsx
      developers/
        create.tsx
        edit.tsx
        list.tsx
      resources/
        create.tsx
        edit.tsx
        list.tsx
      Login.tsx
      Profile.tsx
      Register.tsx
    providers/
      constants.ts
    styles/
      theme.ts
    App.tsx
    authProvider.ts
    index.tsx
    vite-env.d.ts
  .gitignore
  .npmrc
  Dockerfile
  eslint.config.js
  index.html
  package.json
  README.MD
  tsconfig.json
  tsconfig.node.json
  vite.config.ts
resource-catalog-service/
  .mvn/
    wrapper/
      maven-wrapper.properties
  src/
    main/
      java/
        com/
          catalog/
            resource_catalog_service/
              config/
                OpenApiConfig.java
              controller/
                CategoryController.java
                ResourceController.java
              dto/
                CategoryRequest.java
                CategoryResponse.java
                ErrorResponse.java
                ResourceRequest.java
                ResourceResponse.java
              entity/
                Category.java
                Resource.java
              exception/
                GlobalExceptionHandler.java
              mapper/
                CategoryMapper.java
                ResourceMapper.java
              repository/
                CategoryRepository.java
                ResourceRepository.java
              service/
                CategoryCommandService.java
                CategoryQueryService.java
                ResourceCommandService.java
                ResourceQueryService.java
              test_requests/
                categories_and_resources.http
                resources.http
              ResourceCatalogServiceApplication.java
      resources/
        application.yml
        logback-spring.xml
    test/
      java/
        com/
          catalog/
            resource_catalog_service/
              controller/
                ResourceControllerTest.java
              repository/
                CategoryRepositoryTest.java
                ResourceRepositoryTest.java
              service/
                CategoryCommandServiceTest.java
                CategoryQueryServiceTest.java
                ResourceCommandServiceTest.java
                ResourceQueryServiceTest.java
              ResourceCatalogServiceApplicationTests.java
  .gitattributes
  .gitignore
  Dockerfile
  mvnw
  mvnw.cmd
  pom.xml
test-requests/
  developers.http
  ecosystem-integration.http
  gateway-test.http
  phase1-refinement.http
.gitignore
docker-compose.yml
README.md
```

# Files

## File: auth-service/src/main/java/com/catalog/authservice/dto/UserResponse.java
````java
package com.catalog.authservice.dto;

public record UserResponse(Long id, String nome, String email) {}
````

## File: frontend-service/src/constants/texts.ts
````typescript
export const APP_TEXTS = {
    profile: {
        title: "Profilo Utente",
        subtitle: "Gestisci le tue informazioni personali",
        labels: {
            name: "Nome",
            email: "Email",
            password: "Nuova Password (lascia vuoto per non cambiare)",
        },
        buttons: {
            save: "Salva Modifiche",
            cancel: "Annulla",
        },
        notifications: {
            success: "Profilo aggiornato con successo",
            error: "Errore durante l'aggiornamento",
        }
    },
    navigation: {
        resources: "Risorse",
        categories: "Categorie",
        developers: "Sviluppatori",
        collections: "Collezioni",
        profile: "Mio Profilo"
    }
};
````

## File: frontend-service/src/pages/Profile.tsx
````typescript
import React, { useEffect } from "react";
import { useGetIdentity, useUpdate } from "@refinedev/core";
import { Form, Input, Typography, Row, Col } from "antd";
import { Card, Button } from "../components/ui/Primitives";
import { APP_TEXTS } from "../constants/texts";

const { Title, Text } = Typography;

export const ProfilePage = () => {
    const { data: identity } = useGetIdentity<{ id: number; name: string; email: string }>();
    const { mutate: updateProfile, isLoading: isPending } = useUpdate();
    const [form] = Form.useForm();

    useEffect(() => {
        if (identity) {
            form.setFieldsValue({
                nome: identity.name,
                email: identity.email
            });
        }
    }, [identity, form]);

    const onFinish = (values: any) => {
        updateProfile({
            resource: "auth/me",
            id: identity?.id ?? "",
            values,
            successNotification: () => ({
                message: APP_TEXTS.profile.notifications.success,
                type: "success",
            }),
        });
    };

    return (
        <div style={{ padding: "24px" }}>
            <Row justify="center">
                <Col xs={24} sm={22} md={18} lg={12}>
                    <Card>
                        <Title level={2} style={{ margin: 0 }}>{APP_TEXTS.profile.title}</Title>
                        <Text type="secondary">{APP_TEXTS.profile.subtitle}</Text>

                        <Form
                            form={form}
                            layout="vertical"
                            onFinish={onFinish}
                            style={{ marginTop: "32px" }}
                        >
                            <Form.Item name="nome" label={APP_TEXTS.profile.labels.name}>
                                <Input size="large" />
                            </Form.Item>
                            <Form.Item name="email" label={APP_TEXTS.profile.labels.email}>
                                <Input size="large" disabled />
                            </Form.Item>
                            <Form.Item name="password" label={APP_TEXTS.profile.labels.password}>
                                <Input.Password size="large" placeholder="Lascia vuoto per mantenere la attuale" />
                            </Form.Item>
                            <Button htmlType="submit" variant="primary" size="large" disabled={isPending} style={{ width: "100%" }}>
                                {isPending ? "Salvataggio..." : APP_TEXTS.profile.buttons.save}
                            </Button>
                        </Form>
                    </Card>
                </Col>
            </Row>
        </div>
    );
};
````

## File: frontend-service/src/styles/theme.ts
````typescript
import { ThemeConfig, theme } from "antd";

export const lightTheme: ThemeConfig = {
    algorithm: theme.defaultAlgorithm,
    token: {
        colorPrimary: "#4A90E2",
        colorBgContainer: "#ffffff",
        colorText: "#2D3748",
    },
};

export const darkTheme: ThemeConfig = {
    algorithm: theme.darkAlgorithm,
    token: {
        colorPrimary: "#63B3ED",
        colorBgContainer: "#1A202C",
        colorText: "#F7FAFC",
        colorTextSecondary: "#A0AEC0",
    },
};
````

## File: api-gateway/.mvn/wrapper/maven-wrapper.properties
````
wrapperVersion=3.3.4
distributionType=only-script
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.14/apache-maven-3.9.14-bin.zip
````

## File: api-gateway/src/main/java/com/catalog/apigateway/config/SecurityConfig.java
````java
package com.catalog.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .cors(cors -> cors.configurationSource(corsConfigurationSource()))
                .authorizeExchange(exchanges -> exchanges
                        .pathMatchers(HttpMethod.OPTIONS).permitAll() // Permetti esplicitamente le OPTIONS
                        .anyExchange().permitAll()
                )
                .build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        // pattern "*" permette l'accesso da qualsiasi origine (localhost, IP VM, ecc)
        configuration.setAllowedOriginPatterns(Collections.singletonList("*"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH"));
        configuration.setAllowedHeaders(Collections.singletonList("*"));
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
````

## File: api-gateway/src/main/java/com/catalog/apigateway/util/JwtUtil.java
````java
package com.catalog.apigateway.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    public void validateToken(final String token) {
        // Se il token è manomesso o scaduto, questa riga lancerà un'eccezione
        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
    }

    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
````

## File: api-gateway/src/main/java/com/catalog/apigateway/ApiGatewayApplication.java
````java
package com.catalog.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
````

## File: api-gateway/src/main/resources/logback-spring.xml
````xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <appender name="CONSOLE_JSON" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>{"timestamp":"%d{yyyy-MM-dd'T'HH:mm:ss.SSSZ}", "level":"%level", "thread":"%thread", "logger":"%logger{36}", "message":"%replace(%msg){'"', '\''}"}%n</pattern>
        </encoder>
    </appender>

    <root level="INFO">
        <appender-ref ref="CONSOLE_JSON" />
    </root>
</configuration>
````

## File: api-gateway/src/test/java/com/catalog/apigateway/ApiGatewayApplicationTests.java
````java
package com.catalog.apigateway;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Disabilitato per evitare la dipendenza dal database PostgreSQL durante gli unit test")
class ApiGatewayApplicationTests {

    @Test
    void contextLoads() {
    }

}
````

## File: api-gateway/.gitattributes
````
/mvnw text eol=lf
*.cmd text eol=crlf
````

## File: api-gateway/.gitignore
````
HELP.md
target/
.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
!**/src/test/**/target/

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/
build/
!**/src/main/**/build/
!**/src/test/**/build/

### VS Code ###
.vscode/
````

## File: api-gateway/Dockerfile
````
# Stage 1: Build
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
````

## File: api-gateway/mvnw
````
#!/bin/sh
# ----------------------------------------------------------------------------
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
# ----------------------------------------------------------------------------

# ----------------------------------------------------------------------------
# Apache Maven Wrapper startup batch script, version 3.3.4
#
# Optional ENV vars
# -----------------
#   JAVA_HOME - location of a JDK home dir, required when download maven via java source
#   MVNW_REPOURL - repo url base for downloading maven distribution
#   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
#   MVNW_VERBOSE - true: enable verbose log; debug: trace the mvnw script; others: silence the output
# ----------------------------------------------------------------------------

set -euf
[ "${MVNW_VERBOSE-}" != debug ] || set -x

# OS specific support.
native_path() { printf %s\\n "$1"; }
case "$(uname)" in
CYGWIN* | MINGW*)
  [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME")"
  native_path() { cygpath --path --windows "$1"; }
  ;;
esac

# set JAVACMD and JAVACCMD
set_java_home() {
  # For Cygwin and MinGW, ensure paths are in Unix format before anything is touched
  if [ -n "${JAVA_HOME-}" ]; then
    if [ -x "$JAVA_HOME/jre/sh/java" ]; then
      # IBM's JDK on AIX uses strange locations for the executables
      JAVACMD="$JAVA_HOME/jre/sh/java"
      JAVACCMD="$JAVA_HOME/jre/sh/javac"
    else
      JAVACMD="$JAVA_HOME/bin/java"
      JAVACCMD="$JAVA_HOME/bin/javac"

      if [ ! -x "$JAVACMD" ] || [ ! -x "$JAVACCMD" ]; then
        echo "The JAVA_HOME environment variable is not defined correctly, so mvnw cannot run." >&2
        echo "JAVA_HOME is set to \"$JAVA_HOME\", but \"\$JAVA_HOME/bin/java\" or \"\$JAVA_HOME/bin/javac\" does not exist." >&2
        return 1
      fi
    fi
  else
    JAVACMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v java
    )" || :
    JAVACCMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v javac
    )" || :

    if [ ! -x "${JAVACMD-}" ] || [ ! -x "${JAVACCMD-}" ]; then
      echo "The java/javac command does not exist in PATH nor is JAVA_HOME set, so mvnw cannot run." >&2
      return 1
    fi
  fi
}

# hash string like Java String::hashCode
hash_string() {
  str="${1:-}" h=0
  while [ -n "$str" ]; do
    char="${str%"${str#?}"}"
    h=$(((h * 31 + $(LC_CTYPE=C printf %d "'$char")) % 4294967296))
    str="${str#?}"
  done
  printf %x\\n $h
}

verbose() { :; }
[ "${MVNW_VERBOSE-}" != true ] || verbose() { printf %s\\n "${1-}"; }

die() {
  printf %s\\n "$1" >&2
  exit 1
}

trim() {
  # MWRAPPER-139:
  #   Trims trailing and leading whitespace, carriage returns, tabs, and linefeeds.
  #   Needed for removing poorly interpreted newline sequences when running in more
  #   exotic environments such as mingw bash on Windows.
  printf "%s" "${1}" | tr -d '[:space:]'
}

scriptDir="$(dirname "$0")"
scriptName="$(basename "$0")"

# parse distributionUrl and optional distributionSha256Sum, requires .mvn/wrapper/maven-wrapper.properties
while IFS="=" read -r key value; do
  case "${key-}" in
  distributionUrl) distributionUrl=$(trim "${value-}") ;;
  distributionSha256Sum) distributionSha256Sum=$(trim "${value-}") ;;
  esac
done <"$scriptDir/.mvn/wrapper/maven-wrapper.properties"
[ -n "${distributionUrl-}" ] || die "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"

case "${distributionUrl##*/}" in
maven-mvnd-*bin.*)
  MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/
  case "${PROCESSOR_ARCHITECTURE-}${PROCESSOR_ARCHITEW6432-}:$(uname -a)" in
  *AMD64:CYGWIN* | *AMD64:MINGW*) distributionPlatform=windows-amd64 ;;
  :Darwin*x86_64) distributionPlatform=darwin-amd64 ;;
  :Darwin*arm64) distributionPlatform=darwin-aarch64 ;;
  :Linux*x86_64*) distributionPlatform=linux-amd64 ;;
  *)
    echo "Cannot detect native platform for mvnd on $(uname)-$(uname -m), use pure java version" >&2
    distributionPlatform=linux-amd64
    ;;
  esac
  distributionUrl="${distributionUrl%-bin.*}-$distributionPlatform.zip"
  ;;
maven-mvnd-*) MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/ ;;
*) MVN_CMD="mvn${scriptName#mvnw}" _MVNW_REPO_PATTERN=/org/apache/maven/ ;;
esac

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
[ -z "${MVNW_REPOURL-}" ] || distributionUrl="$MVNW_REPOURL$_MVNW_REPO_PATTERN${distributionUrl#*"$_MVNW_REPO_PATTERN"}"
distributionUrlName="${distributionUrl##*/}"
distributionUrlNameMain="${distributionUrlName%.*}"
distributionUrlNameMain="${distributionUrlNameMain%-bin}"
MAVEN_USER_HOME="${MAVEN_USER_HOME:-${HOME}/.m2}"
MAVEN_HOME="${MAVEN_USER_HOME}/wrapper/dists/${distributionUrlNameMain-}/$(hash_string "$distributionUrl")"

exec_maven() {
  unset MVNW_VERBOSE MVNW_USERNAME MVNW_PASSWORD MVNW_REPOURL || :
  exec "$MAVEN_HOME/bin/$MVN_CMD" "$@" || die "cannot exec $MAVEN_HOME/bin/$MVN_CMD"
}

if [ -d "$MAVEN_HOME" ]; then
  verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  exec_maven "$@"
fi

case "${distributionUrl-}" in
*?-bin.zip | *?maven-mvnd-?*-?*.zip) ;;
*) die "distributionUrl is not valid, must match *-bin.zip or maven-mvnd-*.zip, but found '${distributionUrl-}'" ;;
esac

# prepare tmp dir
if TMP_DOWNLOAD_DIR="$(mktemp -d)" && [ -d "$TMP_DOWNLOAD_DIR" ]; then
  clean() { rm -rf -- "$TMP_DOWNLOAD_DIR"; }
  trap clean HUP INT TERM EXIT
else
  die "cannot create temp dir"
fi

mkdir -p -- "${MAVEN_HOME%/*}"

# Download and Install Apache Maven
verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
verbose "Downloading from: $distributionUrl"
verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

# select .zip or .tar.gz
if ! command -v unzip >/dev/null; then
  distributionUrl="${distributionUrl%.zip}.tar.gz"
  distributionUrlName="${distributionUrl##*/}"
fi

# verbose opt
__MVNW_QUIET_WGET=--quiet __MVNW_QUIET_CURL=--silent __MVNW_QUIET_UNZIP=-q __MVNW_QUIET_TAR=''
[ "${MVNW_VERBOSE-}" != true ] || __MVNW_QUIET_WGET='' __MVNW_QUIET_CURL='' __MVNW_QUIET_UNZIP='' __MVNW_QUIET_TAR=v

# normalize http auth
case "${MVNW_PASSWORD:+has-password}" in
'') MVNW_USERNAME='' MVNW_PASSWORD='' ;;
has-password) [ -n "${MVNW_USERNAME-}" ] || MVNW_USERNAME='' MVNW_PASSWORD='' ;;
esac

if [ -z "${MVNW_USERNAME-}" ] && command -v wget >/dev/null; then
  verbose "Found wget ... using wget"
  wget ${__MVNW_QUIET_WGET:+"$__MVNW_QUIET_WGET"} "$distributionUrl" -O "$TMP_DOWNLOAD_DIR/$distributionUrlName" || die "wget: Failed to fetch $distributionUrl"
elif [ -z "${MVNW_USERNAME-}" ] && command -v curl >/dev/null; then
  verbose "Found curl ... using curl"
  curl ${__MVNW_QUIET_CURL:+"$__MVNW_QUIET_CURL"} -f -L -o "$TMP_DOWNLOAD_DIR/$distributionUrlName" "$distributionUrl" || die "curl: Failed to fetch $distributionUrl"
elif set_java_home; then
  verbose "Falling back to use Java to download"
  javaSource="$TMP_DOWNLOAD_DIR/Downloader.java"
  targetZip="$TMP_DOWNLOAD_DIR/$distributionUrlName"
  cat >"$javaSource" <<-END
	public class Downloader extends java.net.Authenticator
	{
	  protected java.net.PasswordAuthentication getPasswordAuthentication()
	  {
	    return new java.net.PasswordAuthentication( System.getenv( "MVNW_USERNAME" ), System.getenv( "MVNW_PASSWORD" ).toCharArray() );
	  }
	  public static void main( String[] args ) throws Exception
	  {
	    setDefault( new Downloader() );
	    java.nio.file.Files.copy( java.net.URI.create( args[0] ).toURL().openStream(), java.nio.file.Paths.get( args[1] ).toAbsolutePath().normalize() );
	  }
	}
	END
  # For Cygwin/MinGW, switch paths to Windows format before running javac and java
  verbose " - Compiling Downloader.java ..."
  "$(native_path "$JAVACCMD")" "$(native_path "$javaSource")" || die "Failed to compile Downloader.java"
  verbose " - Running Downloader.java ..."
  "$(native_path "$JAVACMD")" -cp "$(native_path "$TMP_DOWNLOAD_DIR")" Downloader "$distributionUrl" "$(native_path "$targetZip")"
fi

# If specified, validate the SHA-256 sum of the Maven distribution zip file
if [ -n "${distributionSha256Sum-}" ]; then
  distributionSha256Result=false
  if [ "$MVN_CMD" = mvnd.sh ]; then
    echo "Checksum validation is not supported for maven-mvnd." >&2
    echo "Please disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  elif command -v sha256sum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | sha256sum -c - >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  elif command -v shasum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | shasum -a 256 -c >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  else
    echo "Checksum validation was requested but neither 'sha256sum' or 'shasum' are available." >&2
    echo "Please install either command, or disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  fi
  if [ $distributionSha256Result = false ]; then
    echo "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised." >&2
    echo "If you updated your Maven version, you need to update the specified distributionSha256Sum property." >&2
    exit 1
  fi
fi

# unzip and move
if command -v unzip >/dev/null; then
  unzip ${__MVNW_QUIET_UNZIP:+"$__MVNW_QUIET_UNZIP"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -d "$TMP_DOWNLOAD_DIR" || die "failed to unzip"
else
  tar xzf${__MVNW_QUIET_TAR:+"$__MVNW_QUIET_TAR"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -C "$TMP_DOWNLOAD_DIR" || die "failed to untar"
fi

# Find the actual extracted directory name (handles snapshots where filename != directory name)
actualDistributionDir=""

# First try the expected directory name (for regular distributions)
if [ -d "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" ]; then
  if [ -f "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain/bin/$MVN_CMD" ]; then
    actualDistributionDir="$distributionUrlNameMain"
  fi
fi

# If not found, search for any directory with the Maven executable (for snapshots)
if [ -z "$actualDistributionDir" ]; then
  # enable globbing to iterate over items
  set +f
  for dir in "$TMP_DOWNLOAD_DIR"/*; do
    if [ -d "$dir" ]; then
      if [ -f "$dir/bin/$MVN_CMD" ]; then
        actualDistributionDir="$(basename "$dir")"
        break
      fi
    fi
  done
  set -f
fi

if [ -z "$actualDistributionDir" ]; then
  verbose "Contents of $TMP_DOWNLOAD_DIR:"
  verbose "$(ls -la "$TMP_DOWNLOAD_DIR")"
  die "Could not find Maven distribution directory in extracted archive"
fi

verbose "Found extracted Maven distribution directory: $actualDistributionDir"
printf %s\\n "$distributionUrl" >"$TMP_DOWNLOAD_DIR/$actualDistributionDir/mvnw.url"
mv -- "$TMP_DOWNLOAD_DIR/$actualDistributionDir" "$MAVEN_HOME" || [ -d "$MAVEN_HOME" ] || die "fail to move MAVEN_HOME"

clean || :
exec_maven "$@"
````

## File: api-gateway/mvnw.cmd
````batch
<# : batch portion
@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Apache Maven Wrapper startup batch script, version 3.3.4
@REM
@REM Optional ENV vars
@REM   MVNW_REPOURL - repo url base for downloading maven distribution
@REM   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
@REM   MVNW_VERBOSE - true: enable verbose log; others: silence the output
@REM ----------------------------------------------------------------------------

@IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
@SET __MVNW_CMD__=
@SET __MVNW_ERROR__=
@SET __MVNW_PSMODULEP_SAVE=%PSModulePath%
@SET PSModulePath=
@FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $script='%__MVNW_ARG0_NAME__%'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw '%~f0'))) -NoNewScope}"`) DO @(
  IF "%%A"=="MVN_CMD" (set __MVNW_CMD__=%%B) ELSE IF "%%B"=="" (echo %%A) ELSE (echo %%A=%%B)
)
@SET PSModulePath=%__MVNW_PSMODULEP_SAVE%
@SET __MVNW_PSMODULEP_SAVE=
@SET __MVNW_ARG0_NAME__=
@SET MVNW_USERNAME=
@SET MVNW_PASSWORD=
@IF NOT "%__MVNW_CMD__%"=="" ("%__MVNW_CMD__%" %*)
@echo Cannot start maven from wrapper >&2 && exit /b 1
@GOTO :EOF
: end batch / begin powershell #>

$ErrorActionPreference = "Stop"
if ($env:MVNW_VERBOSE -eq "true") {
  $VerbosePreference = "Continue"
}

# calculate distributionUrl, requires .mvn/wrapper/maven-wrapper.properties
$distributionUrl = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionUrl
if (!$distributionUrl) {
  Write-Error "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"
}

switch -wildcard -casesensitive ( $($distributionUrl -replace '^.*/','') ) {
  "maven-mvnd-*" {
    $USE_MVND = $true
    $distributionUrl = $distributionUrl -replace '-bin\.[^.]*$',"-windows-amd64.zip"
    $MVN_CMD = "mvnd.cmd"
    break
  }
  default {
    $USE_MVND = $false
    $MVN_CMD = $script -replace '^mvnw','mvn'
    break
  }
}

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
if ($env:MVNW_REPOURL) {
  $MVNW_REPO_PATTERN = if ($USE_MVND -eq $False) { "/org/apache/maven/" } else { "/maven/mvnd/" }
  $distributionUrl = "$env:MVNW_REPOURL$MVNW_REPO_PATTERN$($distributionUrl -replace "^.*$MVNW_REPO_PATTERN",'')"
}
$distributionUrlName = $distributionUrl -replace '^.*/',''
$distributionUrlNameMain = $distributionUrlName -replace '\.[^.]*$','' -replace '-bin$',''

$MAVEN_M2_PATH = "$HOME/.m2"
if ($env:MAVEN_USER_HOME) {
  $MAVEN_M2_PATH = "$env:MAVEN_USER_HOME"
}

if (-not (Test-Path -Path $MAVEN_M2_PATH)) {
    New-Item -Path $MAVEN_M2_PATH -ItemType Directory | Out-Null
}

$MAVEN_WRAPPER_DISTS = $null
if ((Get-Item $MAVEN_M2_PATH).Target[0] -eq $null) {
  $MAVEN_WRAPPER_DISTS = "$MAVEN_M2_PATH/wrapper/dists"
} else {
  $MAVEN_WRAPPER_DISTS = (Get-Item $MAVEN_M2_PATH).Target[0] + "/wrapper/dists"
}

$MAVEN_HOME_PARENT = "$MAVEN_WRAPPER_DISTS/$distributionUrlNameMain"
$MAVEN_HOME_NAME = ([System.Security.Cryptography.SHA256]::Create().ComputeHash([byte[]][char[]]$distributionUrl) | ForEach-Object {$_.ToString("x2")}) -join ''
$MAVEN_HOME = "$MAVEN_HOME_PARENT/$MAVEN_HOME_NAME"

if (Test-Path -Path "$MAVEN_HOME" -PathType Container) {
  Write-Verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
  exit $?
}

if (! $distributionUrlNameMain -or ($distributionUrlName -eq $distributionUrlNameMain)) {
  Write-Error "distributionUrl is not valid, must end with *-bin.zip, but found $distributionUrl"
}

# prepare tmp dir
$TMP_DOWNLOAD_DIR_HOLDER = New-TemporaryFile
$TMP_DOWNLOAD_DIR = New-Item -Itemtype Directory -Path "$TMP_DOWNLOAD_DIR_HOLDER.dir"
$TMP_DOWNLOAD_DIR_HOLDER.Delete() | Out-Null
trap {
  if ($TMP_DOWNLOAD_DIR.Exists) {
    try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
    catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
  }
}

New-Item -Itemtype Directory -Path "$MAVEN_HOME_PARENT" -Force | Out-Null

# Download and Install Apache Maven
Write-Verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
Write-Verbose "Downloading from: $distributionUrl"
Write-Verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

$webclient = New-Object System.Net.WebClient
if ($env:MVNW_USERNAME -and $env:MVNW_PASSWORD) {
  $webclient.Credentials = New-Object System.Net.NetworkCredential($env:MVNW_USERNAME, $env:MVNW_PASSWORD)
}
[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
$webclient.DownloadFile($distributionUrl, "$TMP_DOWNLOAD_DIR/$distributionUrlName") | Out-Null

# If specified, validate the SHA-256 sum of the Maven distribution zip file
$distributionSha256Sum = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionSha256Sum
if ($distributionSha256Sum) {
  if ($USE_MVND) {
    Write-Error "Checksum validation is not supported for maven-mvnd. `nPlease disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties."
  }
  Import-Module $PSHOME\Modules\Microsoft.PowerShell.Utility -Function Get-FileHash
  if ((Get-FileHash "$TMP_DOWNLOAD_DIR/$distributionUrlName" -Algorithm SHA256).Hash.ToLower() -ne $distributionSha256Sum) {
    Write-Error "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised. If you updated your Maven version, you need to update the specified distributionSha256Sum property."
  }
}

# unzip and move
Expand-Archive "$TMP_DOWNLOAD_DIR/$distributionUrlName" -DestinationPath "$TMP_DOWNLOAD_DIR" | Out-Null

# Find the actual extracted directory name (handles snapshots where filename != directory name)
$actualDistributionDir = ""

# First try the expected directory name (for regular distributions)
$expectedPath = Join-Path "$TMP_DOWNLOAD_DIR" "$distributionUrlNameMain"
$expectedMvnPath = Join-Path "$expectedPath" "bin/$MVN_CMD"
if ((Test-Path -Path $expectedPath -PathType Container) -and (Test-Path -Path $expectedMvnPath -PathType Leaf)) {
  $actualDistributionDir = $distributionUrlNameMain
}

# If not found, search for any directory with the Maven executable (for snapshots)
if (!$actualDistributionDir) {
  Get-ChildItem -Path "$TMP_DOWNLOAD_DIR" -Directory | ForEach-Object {
    $testPath = Join-Path $_.FullName "bin/$MVN_CMD"
    if (Test-Path -Path $testPath -PathType Leaf) {
      $actualDistributionDir = $_.Name
    }
  }
}

if (!$actualDistributionDir) {
  Write-Error "Could not find Maven distribution directory in extracted archive"
}

Write-Verbose "Found extracted Maven distribution directory: $actualDistributionDir"
Rename-Item -Path "$TMP_DOWNLOAD_DIR/$actualDistributionDir" -NewName $MAVEN_HOME_NAME | Out-Null
try {
  Move-Item -Path "$TMP_DOWNLOAD_DIR/$MAVEN_HOME_NAME" -Destination $MAVEN_HOME_PARENT | Out-Null
} catch {
  if (! (Test-Path -Path "$MAVEN_HOME" -PathType Container)) {
    Write-Error "fail to move MAVEN_HOME"
  }
} finally {
  try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
  catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
}

Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
````

## File: auth-service/.mvn/wrapper/maven-wrapper.properties
````
wrapperVersion=3.3.4
distributionType=only-script
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.14/apache-maven-3.9.14-bin.zip
````

## File: auth-service/src/main/java/com/catalog/authservice/config/AuthConfig.java
````java
package com.catalog.authservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AuthConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/v1/auth/**", "/v3/api-docs/**", "/swagger-ui/**").permitAll()
                        .anyRequest().authenticated()
                )
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }
}
````

## File: auth-service/src/main/java/com/catalog/authservice/config/CustomUserDetailsService.java
````java
package com.catalog.authservice.config;

import com.catalog.authservice.entity.UserCredential;
import com.catalog.authservice.repository.UserCredentialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException; // <--- CORRETTO (userdetails, non username)
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserCredentialRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserCredential user = repository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Utente non trovato con email: " + email));

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                new ArrayList<>()
        );
    }
}
````

## File: auth-service/src/main/java/com/catalog/authservice/config/OpenApiConfig.java
````java
package com.catalog.authservice.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .addServersItem(new Server()
                        .url("http://localhost")
                        .description("API Gateway"))
                // Configurazione per Swagger UI (Pulsante "Authorize")
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
                .components(new Components()
                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                .name("bearerAuth")
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }
}
````

## File: auth-service/src/main/java/com/catalog/authservice/controller/AuthController.java
````java
package com.catalog.authservice.controller;

import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.dto.UserResponse;
import com.catalog.authservice.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @GetMapping("/me")
    public ResponseEntity<UserResponse> getMe(Principal principal) {
        return ResponseEntity.ok(authService.getMe(principal.getName()));
    }

    @PutMapping("/me")
    public ResponseEntity<Void> updateMe(Principal principal, @RequestBody AuthRequest request) {
        authService.updateMe(principal.getName(), request);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody AuthRequest request) {
        return new ResponseEntity<>(authService.register(request), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}
````

## File: auth-service/src/main/java/com/catalog/authservice/dto/AuthRequest.java
````java
package com.catalog.authservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record AuthRequest(
        @Email(message = "Email non valida")
        @NotBlank(message = "L'email è obbligatoria")
        String email,

        @NotBlank(message = "La password è obbligatoria")
        String password
) {}
````

## File: auth-service/src/main/java/com/catalog/authservice/dto/AuthResponse.java
````java
package com.catalog.authservice.dto;

public record AuthResponse(String token) {}
````

## File: auth-service/src/main/java/com/catalog/authservice/dto/ErrorResponse.java
````java
package com.catalog.authservice.dto;

import java.time.LocalDateTime;

public record ErrorResponse(
        int status,
        String message,
        LocalDateTime timestamp
) {}
````

## File: auth-service/src/main/java/com/catalog/authservice/entity/UserCredential.java
````java
package com.catalog.authservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_credentials")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
}
````

## File: auth-service/src/main/java/com/catalog/authservice/exception/GlobalExceptionHandler.java
````java
package com.catalog.authservice.exception;

import com.catalog.authservice.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException ex) {
        ErrorResponse error = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> fieldError.getField() + ": " + fieldError.getDefaultMessage())
                .collect(Collectors.joining(", "));

        ErrorResponse error = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                errorMessage,
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
````

## File: auth-service/src/main/java/com/catalog/authservice/repository/UserCredentialRepository.java
````java
package com.catalog.authservice.repository;

import com.catalog.authservice.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserCredentialRepository extends JpaRepository<UserCredential, Long> {
    Optional<UserCredential> findByEmail(String email);
}
````

## File: auth-service/src/main/java/com/catalog/authservice/service/AuthService.java
````java
package com.catalog.authservice.service;

import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.dto.UserResponse;

public interface AuthService {
    String register(AuthRequest request);
    UserResponse getMe(String email);
    void updateMe(String currentEmail, AuthRequest updateData);
    AuthResponse login(AuthRequest request);
}
````

## File: auth-service/src/main/java/com/catalog/authservice/service/AuthServiceImpl.java
````java
package com.catalog.authservice.service;

import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.dto.UserResponse;
import com.catalog.authservice.entity.UserCredential;
import com.catalog.authservice.repository.UserCredentialRepository;
import com.catalog.authservice.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserCredentialRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;

    @Override
    public String register(AuthRequest request) {
        repository.findByEmail(request.email())
                .ifPresent(u -> { throw new RuntimeException("Utente già registrato con questa email"); });

        UserCredential user = UserCredential.builder()
                .nome(request.nome())
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .build();

        repository.save(user);
        return "Utente registrato con successo";
    }

    @Override
    @Transactional(readOnly = true)
    public UserResponse getMe(String email) {
        UserCredential user = repository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Utente non trovato"));
        return new UserResponse(user.getId(), user.getNome(), user.getEmail());
    }

    @Override
    @Transactional
    public void updateMe(String currentEmail, AuthRequest updateData) {
        UserCredential user = repository.findByEmail(currentEmail)
                .orElseThrow(() -> new RuntimeException("Utente non trovato"));

        if (updateData.nome() != null) user.setNome(updateData.nome());
        if (updateData.password() != null && !updateData.password().isEmpty()) {
            user.setPassword(passwordEncoder.encode(updateData.password()));
        }

        repository.save(user);
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.email(), request.password())
        );

        if (authenticate.isAuthenticated()) {
            String token = jwtUtil.generateToken(request.email());
            return new AuthResponse(token);
        } else {
            throw new RuntimeException("Accesso negato: credenziali non valide");
        }
    }
}
````

## File: auth-service/src/main/java/com/catalog/authservice/util/JwtUtil.java
````java
package com.catalog.authservice.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private long expiration;

    public String generateToken(String email) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, email);
    }

    private String createToken(Map<String, Object> claims, String subject) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secret);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public void validateToken(final String token) {
        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
    }
}
````

## File: auth-service/src/main/java/com/catalog/authservice/AuthServiceApplication.java
````java
package com.catalog.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }

}
````

## File: auth-service/src/main/resources/application.yml
````yaml
server:
  port: 8082

spring:
  application:
    name: auth-service
  datasource:
    url: ${AUTH_DATASOURCE_URL}
    username: ${AUTH_DATASOURCE_USERNAME}
    password: ${AUTH_DATASOURCE_PASSWORD}
  jpa:
    hibernate:
      ddl-auto: ${SPRING_JPA_HIBERNATE_DDL_AUTO}
    show-sql: ${SPRING_JPA_SHOW_SQL}
    properties:
      hibernate:
        format_sql: false
        dialect: org.hibernate.dialect.PostgreSQLDialect

jwt:
  secret: ${JWT_SECRET}
  expiration: ${JWT_EXPIRATION}

springdoc:
  openapi:
    servers:
      - url: ${API_GATEWAY_URL}
        description: "API Gateway"
````

## File: auth-service/src/main/resources/logback-spring.xml
````xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <appender name="CONSOLE_JSON" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>{"timestamp":"%d{yyyy-MM-dd'T'HH:mm:ss.SSSZ}", "level":"%level", "thread":"%thread", "logger":"%logger{36}", "message":"%replace(%msg){'"', '\''}"}%n</pattern>
        </encoder>
    </appender>

    <root level="INFO">
        <appender-ref ref="CONSOLE_JSON" />
    </root>
</configuration>
````

## File: auth-service/src/test/java/com/catalog/authservice/repository/UserCredentialRepositoryTest.java
````java
package com.catalog.authservice.repository;

import com.catalog.authservice.entity.UserCredential;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserCredentialRepositoryTest {

    @Autowired
    private UserCredentialRepository repository;

    @Test
    void findByEmail_ShouldReturnCredentials() {
        UserCredential user = UserCredential.builder()
                .email("admin@test.com")
                .password("secret")
                .build();
        repository.save(user);

        Optional<UserCredential> found = repository.findByEmail("admin@test.com");

        assertTrue(found.isPresent());
        assertEquals("secret", found.get().getPassword());
    }
}
````

## File: auth-service/src/test/java/com/catalog/authservice/service/AuthServiceImplTest.java
````java
package com.catalog.authservice.service;

import com.catalog.authservice.dto.AuthRequest;
import com.catalog.authservice.dto.AuthResponse;
import com.catalog.authservice.entity.UserCredential;
import com.catalog.authservice.repository.UserCredentialRepository;
import com.catalog.authservice.util.JwtUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthServiceImplTest {

    @Mock
    private UserCredentialRepository repository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @Mock
    private JwtUtil jwtUtil;

    @Mock
    private AuthenticationManager authenticationManager;

    @InjectMocks
    private AuthServiceImpl authService;

    @Test
    void register_WhenNewUser_ShouldSave() {
        AuthRequest request = new AuthRequest("test@example.com", "password123");

        when(repository.findByEmail(request.email())).thenReturn(Optional.empty());
        when(passwordEncoder.encode(request.password())).thenReturn("encodedPassword");

        String result = authService.register(request);

        assertEquals("Utente registrato con successo", result);
        verify(repository).save(any(UserCredential.class));
    }

    @Test
    void register_WhenUserExists_ShouldThrowException() {
        AuthRequest request = new AuthRequest("test@example.com", "password123");

        when(repository.findByEmail(request.email())).thenReturn(Optional.of(new UserCredential()));

        assertThrows(RuntimeException.class, () -> authService.register(request));
        verify(repository, never()).save(any(UserCredential.class));
    }

    @Test
    void login_WhenValidCredentials_ShouldReturnToken() {
        AuthRequest request = new AuthRequest("test@example.com", "password123");
        Authentication authentication = mock(Authentication.class);

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).thenReturn(authentication);
        when(authentication.isAuthenticated()).thenReturn(true);
        when(jwtUtil.generateToken(request.email())).thenReturn("mocked-jwt-token");

        AuthResponse response = authService.login(request);

        assertEquals("mocked-jwt-token", response.token());
    }

    @Test
    void login_WhenInvalidCredentials_ShouldThrowException() {
        AuthRequest request = new AuthRequest("test@example.com", "wrongpassword");
        Authentication authentication = mock(Authentication.class);

        when(authenticationManager.authenticate(any(UsernamePasswordAuthenticationToken.class))).thenReturn(authentication);
        when(authentication.isAuthenticated()).thenReturn(false);

        assertThrows(RuntimeException.class, () -> authService.login(request));
    }
}
````

## File: auth-service/src/test/java/com/catalog/authservice/AuthServiceApplicationTests.java
````java
package com.catalog.authservice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Disabilitato per evitare la dipendenza dal database PostgreSQL durante gli unit test")
class AuthServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
````

## File: auth-service/.gitattributes
````
/mvnw text eol=lf
*.cmd text eol=crlf
````

## File: auth-service/.gitignore
````
HELP.md
target/
.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
!**/src/test/**/target/

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/
build/
!**/src/main/**/build/
!**/src/test/**/build/

### VS Code ###
.vscode/
````

## File: auth-service/Dockerfile
````
# Stage 1: Build
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
````

## File: auth-service/mvnw
````
#!/bin/sh
# ----------------------------------------------------------------------------
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
# ----------------------------------------------------------------------------

# ----------------------------------------------------------------------------
# Apache Maven Wrapper startup batch script, version 3.3.4
#
# Optional ENV vars
# -----------------
#   JAVA_HOME - location of a JDK home dir, required when download maven via java source
#   MVNW_REPOURL - repo url base for downloading maven distribution
#   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
#   MVNW_VERBOSE - true: enable verbose log; debug: trace the mvnw script; others: silence the output
# ----------------------------------------------------------------------------

set -euf
[ "${MVNW_VERBOSE-}" != debug ] || set -x

# OS specific support.
native_path() { printf %s\\n "$1"; }
case "$(uname)" in
CYGWIN* | MINGW*)
  [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME")"
  native_path() { cygpath --path --windows "$1"; }
  ;;
esac

# set JAVACMD and JAVACCMD
set_java_home() {
  # For Cygwin and MinGW, ensure paths are in Unix format before anything is touched
  if [ -n "${JAVA_HOME-}" ]; then
    if [ -x "$JAVA_HOME/jre/sh/java" ]; then
      # IBM's JDK on AIX uses strange locations for the executables
      JAVACMD="$JAVA_HOME/jre/sh/java"
      JAVACCMD="$JAVA_HOME/jre/sh/javac"
    else
      JAVACMD="$JAVA_HOME/bin/java"
      JAVACCMD="$JAVA_HOME/bin/javac"

      if [ ! -x "$JAVACMD" ] || [ ! -x "$JAVACCMD" ]; then
        echo "The JAVA_HOME environment variable is not defined correctly, so mvnw cannot run." >&2
        echo "JAVA_HOME is set to \"$JAVA_HOME\", but \"\$JAVA_HOME/bin/java\" or \"\$JAVA_HOME/bin/javac\" does not exist." >&2
        return 1
      fi
    fi
  else
    JAVACMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v java
    )" || :
    JAVACCMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v javac
    )" || :

    if [ ! -x "${JAVACMD-}" ] || [ ! -x "${JAVACCMD-}" ]; then
      echo "The java/javac command does not exist in PATH nor is JAVA_HOME set, so mvnw cannot run." >&2
      return 1
    fi
  fi
}

# hash string like Java String::hashCode
hash_string() {
  str="${1:-}" h=0
  while [ -n "$str" ]; do
    char="${str%"${str#?}"}"
    h=$(((h * 31 + $(LC_CTYPE=C printf %d "'$char")) % 4294967296))
    str="${str#?}"
  done
  printf %x\\n $h
}

verbose() { :; }
[ "${MVNW_VERBOSE-}" != true ] || verbose() { printf %s\\n "${1-}"; }

die() {
  printf %s\\n "$1" >&2
  exit 1
}

trim() {
  # MWRAPPER-139:
  #   Trims trailing and leading whitespace, carriage returns, tabs, and linefeeds.
  #   Needed for removing poorly interpreted newline sequences when running in more
  #   exotic environments such as mingw bash on Windows.
  printf "%s" "${1}" | tr -d '[:space:]'
}

scriptDir="$(dirname "$0")"
scriptName="$(basename "$0")"

# parse distributionUrl and optional distributionSha256Sum, requires .mvn/wrapper/maven-wrapper.properties
while IFS="=" read -r key value; do
  case "${key-}" in
  distributionUrl) distributionUrl=$(trim "${value-}") ;;
  distributionSha256Sum) distributionSha256Sum=$(trim "${value-}") ;;
  esac
done <"$scriptDir/.mvn/wrapper/maven-wrapper.properties"
[ -n "${distributionUrl-}" ] || die "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"

case "${distributionUrl##*/}" in
maven-mvnd-*bin.*)
  MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/
  case "${PROCESSOR_ARCHITECTURE-}${PROCESSOR_ARCHITEW6432-}:$(uname -a)" in
  *AMD64:CYGWIN* | *AMD64:MINGW*) distributionPlatform=windows-amd64 ;;
  :Darwin*x86_64) distributionPlatform=darwin-amd64 ;;
  :Darwin*arm64) distributionPlatform=darwin-aarch64 ;;
  :Linux*x86_64*) distributionPlatform=linux-amd64 ;;
  *)
    echo "Cannot detect native platform for mvnd on $(uname)-$(uname -m), use pure java version" >&2
    distributionPlatform=linux-amd64
    ;;
  esac
  distributionUrl="${distributionUrl%-bin.*}-$distributionPlatform.zip"
  ;;
maven-mvnd-*) MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/ ;;
*) MVN_CMD="mvn${scriptName#mvnw}" _MVNW_REPO_PATTERN=/org/apache/maven/ ;;
esac

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
[ -z "${MVNW_REPOURL-}" ] || distributionUrl="$MVNW_REPOURL$_MVNW_REPO_PATTERN${distributionUrl#*"$_MVNW_REPO_PATTERN"}"
distributionUrlName="${distributionUrl##*/}"
distributionUrlNameMain="${distributionUrlName%.*}"
distributionUrlNameMain="${distributionUrlNameMain%-bin}"
MAVEN_USER_HOME="${MAVEN_USER_HOME:-${HOME}/.m2}"
MAVEN_HOME="${MAVEN_USER_HOME}/wrapper/dists/${distributionUrlNameMain-}/$(hash_string "$distributionUrl")"

exec_maven() {
  unset MVNW_VERBOSE MVNW_USERNAME MVNW_PASSWORD MVNW_REPOURL || :
  exec "$MAVEN_HOME/bin/$MVN_CMD" "$@" || die "cannot exec $MAVEN_HOME/bin/$MVN_CMD"
}

if [ -d "$MAVEN_HOME" ]; then
  verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  exec_maven "$@"
fi

case "${distributionUrl-}" in
*?-bin.zip | *?maven-mvnd-?*-?*.zip) ;;
*) die "distributionUrl is not valid, must match *-bin.zip or maven-mvnd-*.zip, but found '${distributionUrl-}'" ;;
esac

# prepare tmp dir
if TMP_DOWNLOAD_DIR="$(mktemp -d)" && [ -d "$TMP_DOWNLOAD_DIR" ]; then
  clean() { rm -rf -- "$TMP_DOWNLOAD_DIR"; }
  trap clean HUP INT TERM EXIT
else
  die "cannot create temp dir"
fi

mkdir -p -- "${MAVEN_HOME%/*}"

# Download and Install Apache Maven
verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
verbose "Downloading from: $distributionUrl"
verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

# select .zip or .tar.gz
if ! command -v unzip >/dev/null; then
  distributionUrl="${distributionUrl%.zip}.tar.gz"
  distributionUrlName="${distributionUrl##*/}"
fi

# verbose opt
__MVNW_QUIET_WGET=--quiet __MVNW_QUIET_CURL=--silent __MVNW_QUIET_UNZIP=-q __MVNW_QUIET_TAR=''
[ "${MVNW_VERBOSE-}" != true ] || __MVNW_QUIET_WGET='' __MVNW_QUIET_CURL='' __MVNW_QUIET_UNZIP='' __MVNW_QUIET_TAR=v

# normalize http auth
case "${MVNW_PASSWORD:+has-password}" in
'') MVNW_USERNAME='' MVNW_PASSWORD='' ;;
has-password) [ -n "${MVNW_USERNAME-}" ] || MVNW_USERNAME='' MVNW_PASSWORD='' ;;
esac

if [ -z "${MVNW_USERNAME-}" ] && command -v wget >/dev/null; then
  verbose "Found wget ... using wget"
  wget ${__MVNW_QUIET_WGET:+"$__MVNW_QUIET_WGET"} "$distributionUrl" -O "$TMP_DOWNLOAD_DIR/$distributionUrlName" || die "wget: Failed to fetch $distributionUrl"
elif [ -z "${MVNW_USERNAME-}" ] && command -v curl >/dev/null; then
  verbose "Found curl ... using curl"
  curl ${__MVNW_QUIET_CURL:+"$__MVNW_QUIET_CURL"} -f -L -o "$TMP_DOWNLOAD_DIR/$distributionUrlName" "$distributionUrl" || die "curl: Failed to fetch $distributionUrl"
elif set_java_home; then
  verbose "Falling back to use Java to download"
  javaSource="$TMP_DOWNLOAD_DIR/Downloader.java"
  targetZip="$TMP_DOWNLOAD_DIR/$distributionUrlName"
  cat >"$javaSource" <<-END
	public class Downloader extends java.net.Authenticator
	{
	  protected java.net.PasswordAuthentication getPasswordAuthentication()
	  {
	    return new java.net.PasswordAuthentication( System.getenv( "MVNW_USERNAME" ), System.getenv( "MVNW_PASSWORD" ).toCharArray() );
	  }
	  public static void main( String[] args ) throws Exception
	  {
	    setDefault( new Downloader() );
	    java.nio.file.Files.copy( java.net.URI.create( args[0] ).toURL().openStream(), java.nio.file.Paths.get( args[1] ).toAbsolutePath().normalize() );
	  }
	}
	END
  # For Cygwin/MinGW, switch paths to Windows format before running javac and java
  verbose " - Compiling Downloader.java ..."
  "$(native_path "$JAVACCMD")" "$(native_path "$javaSource")" || die "Failed to compile Downloader.java"
  verbose " - Running Downloader.java ..."
  "$(native_path "$JAVACMD")" -cp "$(native_path "$TMP_DOWNLOAD_DIR")" Downloader "$distributionUrl" "$(native_path "$targetZip")"
fi

# If specified, validate the SHA-256 sum of the Maven distribution zip file
if [ -n "${distributionSha256Sum-}" ]; then
  distributionSha256Result=false
  if [ "$MVN_CMD" = mvnd.sh ]; then
    echo "Checksum validation is not supported for maven-mvnd." >&2
    echo "Please disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  elif command -v sha256sum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | sha256sum -c - >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  elif command -v shasum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | shasum -a 256 -c >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  else
    echo "Checksum validation was requested but neither 'sha256sum' or 'shasum' are available." >&2
    echo "Please install either command, or disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  fi
  if [ $distributionSha256Result = false ]; then
    echo "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised." >&2
    echo "If you updated your Maven version, you need to update the specified distributionSha256Sum property." >&2
    exit 1
  fi
fi

# unzip and move
if command -v unzip >/dev/null; then
  unzip ${__MVNW_QUIET_UNZIP:+"$__MVNW_QUIET_UNZIP"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -d "$TMP_DOWNLOAD_DIR" || die "failed to unzip"
else
  tar xzf${__MVNW_QUIET_TAR:+"$__MVNW_QUIET_TAR"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -C "$TMP_DOWNLOAD_DIR" || die "failed to untar"
fi

# Find the actual extracted directory name (handles snapshots where filename != directory name)
actualDistributionDir=""

# First try the expected directory name (for regular distributions)
if [ -d "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" ]; then
  if [ -f "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain/bin/$MVN_CMD" ]; then
    actualDistributionDir="$distributionUrlNameMain"
  fi
fi

# If not found, search for any directory with the Maven executable (for snapshots)
if [ -z "$actualDistributionDir" ]; then
  # enable globbing to iterate over items
  set +f
  for dir in "$TMP_DOWNLOAD_DIR"/*; do
    if [ -d "$dir" ]; then
      if [ -f "$dir/bin/$MVN_CMD" ]; then
        actualDistributionDir="$(basename "$dir")"
        break
      fi
    fi
  done
  set -f
fi

if [ -z "$actualDistributionDir" ]; then
  verbose "Contents of $TMP_DOWNLOAD_DIR:"
  verbose "$(ls -la "$TMP_DOWNLOAD_DIR")"
  die "Could not find Maven distribution directory in extracted archive"
fi

verbose "Found extracted Maven distribution directory: $actualDistributionDir"
printf %s\\n "$distributionUrl" >"$TMP_DOWNLOAD_DIR/$actualDistributionDir/mvnw.url"
mv -- "$TMP_DOWNLOAD_DIR/$actualDistributionDir" "$MAVEN_HOME" || [ -d "$MAVEN_HOME" ] || die "fail to move MAVEN_HOME"

clean || :
exec_maven "$@"
````

## File: auth-service/mvnw.cmd
````batch
<# : batch portion
@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Apache Maven Wrapper startup batch script, version 3.3.4
@REM
@REM Optional ENV vars
@REM   MVNW_REPOURL - repo url base for downloading maven distribution
@REM   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
@REM   MVNW_VERBOSE - true: enable verbose log; others: silence the output
@REM ----------------------------------------------------------------------------

@IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
@SET __MVNW_CMD__=
@SET __MVNW_ERROR__=
@SET __MVNW_PSMODULEP_SAVE=%PSModulePath%
@SET PSModulePath=
@FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $script='%__MVNW_ARG0_NAME__%'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw '%~f0'))) -NoNewScope}"`) DO @(
  IF "%%A"=="MVN_CMD" (set __MVNW_CMD__=%%B) ELSE IF "%%B"=="" (echo %%A) ELSE (echo %%A=%%B)
)
@SET PSModulePath=%__MVNW_PSMODULEP_SAVE%
@SET __MVNW_PSMODULEP_SAVE=
@SET __MVNW_ARG0_NAME__=
@SET MVNW_USERNAME=
@SET MVNW_PASSWORD=
@IF NOT "%__MVNW_CMD__%"=="" ("%__MVNW_CMD__%" %*)
@echo Cannot start maven from wrapper >&2 && exit /b 1
@GOTO :EOF
: end batch / begin powershell #>

$ErrorActionPreference = "Stop"
if ($env:MVNW_VERBOSE -eq "true") {
  $VerbosePreference = "Continue"
}

# calculate distributionUrl, requires .mvn/wrapper/maven-wrapper.properties
$distributionUrl = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionUrl
if (!$distributionUrl) {
  Write-Error "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"
}

switch -wildcard -casesensitive ( $($distributionUrl -replace '^.*/','') ) {
  "maven-mvnd-*" {
    $USE_MVND = $true
    $distributionUrl = $distributionUrl -replace '-bin\.[^.]*$',"-windows-amd64.zip"
    $MVN_CMD = "mvnd.cmd"
    break
  }
  default {
    $USE_MVND = $false
    $MVN_CMD = $script -replace '^mvnw','mvn'
    break
  }
}

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
if ($env:MVNW_REPOURL) {
  $MVNW_REPO_PATTERN = if ($USE_MVND -eq $False) { "/org/apache/maven/" } else { "/maven/mvnd/" }
  $distributionUrl = "$env:MVNW_REPOURL$MVNW_REPO_PATTERN$($distributionUrl -replace "^.*$MVNW_REPO_PATTERN",'')"
}
$distributionUrlName = $distributionUrl -replace '^.*/',''
$distributionUrlNameMain = $distributionUrlName -replace '\.[^.]*$','' -replace '-bin$',''

$MAVEN_M2_PATH = "$HOME/.m2"
if ($env:MAVEN_USER_HOME) {
  $MAVEN_M2_PATH = "$env:MAVEN_USER_HOME"
}

if (-not (Test-Path -Path $MAVEN_M2_PATH)) {
    New-Item -Path $MAVEN_M2_PATH -ItemType Directory | Out-Null
}

$MAVEN_WRAPPER_DISTS = $null
if ((Get-Item $MAVEN_M2_PATH).Target[0] -eq $null) {
  $MAVEN_WRAPPER_DISTS = "$MAVEN_M2_PATH/wrapper/dists"
} else {
  $MAVEN_WRAPPER_DISTS = (Get-Item $MAVEN_M2_PATH).Target[0] + "/wrapper/dists"
}

$MAVEN_HOME_PARENT = "$MAVEN_WRAPPER_DISTS/$distributionUrlNameMain"
$MAVEN_HOME_NAME = ([System.Security.Cryptography.SHA256]::Create().ComputeHash([byte[]][char[]]$distributionUrl) | ForEach-Object {$_.ToString("x2")}) -join ''
$MAVEN_HOME = "$MAVEN_HOME_PARENT/$MAVEN_HOME_NAME"

if (Test-Path -Path "$MAVEN_HOME" -PathType Container) {
  Write-Verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
  exit $?
}

if (! $distributionUrlNameMain -or ($distributionUrlName -eq $distributionUrlNameMain)) {
  Write-Error "distributionUrl is not valid, must end with *-bin.zip, but found $distributionUrl"
}

# prepare tmp dir
$TMP_DOWNLOAD_DIR_HOLDER = New-TemporaryFile
$TMP_DOWNLOAD_DIR = New-Item -Itemtype Directory -Path "$TMP_DOWNLOAD_DIR_HOLDER.dir"
$TMP_DOWNLOAD_DIR_HOLDER.Delete() | Out-Null
trap {
  if ($TMP_DOWNLOAD_DIR.Exists) {
    try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
    catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
  }
}

New-Item -Itemtype Directory -Path "$MAVEN_HOME_PARENT" -Force | Out-Null

# Download and Install Apache Maven
Write-Verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
Write-Verbose "Downloading from: $distributionUrl"
Write-Verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

$webclient = New-Object System.Net.WebClient
if ($env:MVNW_USERNAME -and $env:MVNW_PASSWORD) {
  $webclient.Credentials = New-Object System.Net.NetworkCredential($env:MVNW_USERNAME, $env:MVNW_PASSWORD)
}
[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
$webclient.DownloadFile($distributionUrl, "$TMP_DOWNLOAD_DIR/$distributionUrlName") | Out-Null

# If specified, validate the SHA-256 sum of the Maven distribution zip file
$distributionSha256Sum = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionSha256Sum
if ($distributionSha256Sum) {
  if ($USE_MVND) {
    Write-Error "Checksum validation is not supported for maven-mvnd. `nPlease disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties."
  }
  Import-Module $PSHOME\Modules\Microsoft.PowerShell.Utility -Function Get-FileHash
  if ((Get-FileHash "$TMP_DOWNLOAD_DIR/$distributionUrlName" -Algorithm SHA256).Hash.ToLower() -ne $distributionSha256Sum) {
    Write-Error "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised. If you updated your Maven version, you need to update the specified distributionSha256Sum property."
  }
}

# unzip and move
Expand-Archive "$TMP_DOWNLOAD_DIR/$distributionUrlName" -DestinationPath "$TMP_DOWNLOAD_DIR" | Out-Null

# Find the actual extracted directory name (handles snapshots where filename != directory name)
$actualDistributionDir = ""

# First try the expected directory name (for regular distributions)
$expectedPath = Join-Path "$TMP_DOWNLOAD_DIR" "$distributionUrlNameMain"
$expectedMvnPath = Join-Path "$expectedPath" "bin/$MVN_CMD"
if ((Test-Path -Path $expectedPath -PathType Container) -and (Test-Path -Path $expectedMvnPath -PathType Leaf)) {
  $actualDistributionDir = $distributionUrlNameMain
}

# If not found, search for any directory with the Maven executable (for snapshots)
if (!$actualDistributionDir) {
  Get-ChildItem -Path "$TMP_DOWNLOAD_DIR" -Directory | ForEach-Object {
    $testPath = Join-Path $_.FullName "bin/$MVN_CMD"
    if (Test-Path -Path $testPath -PathType Leaf) {
      $actualDistributionDir = $_.Name
    }
  }
}

if (!$actualDistributionDir) {
  Write-Error "Could not find Maven distribution directory in extracted archive"
}

Write-Verbose "Found extracted Maven distribution directory: $actualDistributionDir"
Rename-Item -Path "$TMP_DOWNLOAD_DIR/$actualDistributionDir" -NewName $MAVEN_HOME_NAME | Out-Null
try {
  Move-Item -Path "$TMP_DOWNLOAD_DIR/$MAVEN_HOME_NAME" -Destination $MAVEN_HOME_PARENT | Out-Null
} catch {
  if (! (Test-Path -Path "$MAVEN_HOME" -PathType Container)) {
    Write-Error "fail to move MAVEN_HOME"
  }
} finally {
  try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
  catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
}

Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
````

## File: auth-service/pom.xml
````xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.5</version>
        <relativePath/>
    </parent>
    <groupId>com.catalog</groupId>
    <artifactId>auth-service</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <properties>
        <java.version>17</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.5.0</version>
        </dependency>

        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-api</artifactId>
            <version>0.11.5</version>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>0.11.5</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>0.11.5</version>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>1.18.30</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
````

## File: developer-collection-service/.mvn/wrapper/maven-wrapper.properties
````
wrapperVersion=3.3.4
distributionType=only-script
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.14/apache-maven-3.9.14-bin.zip
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/client/CustomFeignErrorDecoder.java
````java
package com.catalog.developercollectionservice.client;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

@Component
public class CustomFeignErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() == 404) {
            return new RuntimeException("Risorsa non trovata nel catalogo remoto (404)");
        }
        if (response.status() >= 400 && response.status() <= 499) {
            return new RuntimeException("Errore client durante la chiamata al catalogo (Status: " + response.status() + ")");
        }
        if (response.status() >= 500 && response.status() <= 599) {
            return new RuntimeException("Errore interno del servizio catalogo (Status: " + response.status() + ")");
        }

        return defaultErrorDecoder.decode(methodKey, response);
    }
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/client/ResourceClient.java
````java
package com.catalog.developercollectionservice.client;

import com.catalog.developercollectionservice.dto.ResourceCatalogResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Usiamo il segnaposto per l'URL definito nel file yml
@FeignClient(name = "resource-catalog-service", url = "${services.resource-catalog.url}")
public interface ResourceClient {

    @GetMapping("/api/v1/resources/{id}")
    ResourceCatalogResponse getResourceById(@PathVariable("id") Long id);
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/config/OpenApiConfig.java
````java
package com.catalog.developercollectionservice.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .addServersItem(new Server()
                        .url("http://localhost")
                        .description("API Gateway"))
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
                .components(new Components()
                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                .name("bearerAuth")
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/dto/CollectionRequest.java
````java
package com.catalog.developercollectionservice.dto;

import jakarta.validation.constraints.NotNull;

public record CollectionRequest(
        @NotNull Long developerId,
        @NotNull Long resourceId
) {}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/dto/DeveloperCollectionResponse.java
````java
package com.catalog.developercollectionservice.dto;

import java.util.List;

public record DeveloperCollectionResponse(
        Long developerId,
        String developerNome,
        List<CollectionItemResponse> items
) {}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/dto/DeveloperRequest.java
````java
package com.catalog.developercollectionservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DeveloperRequest(
        @NotBlank(message = "Il nome è obbligatorio")
        String nome,

        @Email(message = "Email non valida")
        @NotBlank(message = "L'email è obbligatoria")
        String email
) {}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/dto/DeveloperResponse.java
````java
package com.catalog.developercollectionservice.dto;

public record DeveloperResponse(
        Long id,
        String nome,
        String email
) {}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/dto/ErrorResponse.java
````java
package com.catalog.developercollectionservice.dto;

import java.time.LocalDateTime;

public record ErrorResponse(
        int status,
        String message,
        LocalDateTime timestamp
) {}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/dto/ResourceCatalogResponse.java
````java
package com.catalog.developercollectionservice.dto;

public record ResourceCatalogResponse(
        Long id,
        String nome,
        String url
) {}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/entity/CollectionItem.java
````java
package com.catalog.developercollectionservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "collection_items")
public class CollectionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "developer_id", nullable = false)
    private Developer developer;

    @Column(name = "resource_id", nullable = false)
    private Long resourceId; // Salviamo solo l'ID, non l'oggetto JPA
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/entity/Developer.java
````java
package com.catalog.developercollectionservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "developers")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Il nome è obbligatorio")
    @Column(nullable = false)
    private String nome;

    @Email(message = "Email non valida")
    @NotBlank(message = "L'email è obbligatoria")
    @Column(nullable = false, unique = true)
    private String email;
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/exception/GlobalExceptionHandler.java
````java
package com.catalog.developercollectionservice.exception;

import com.catalog.developercollectionservice.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException ex) {
        ErrorResponse error = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> fieldError.getField() + ": " + fieldError.getDefaultMessage())
                .collect(Collectors.joining(", "));

        ErrorResponse error = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                errorMessage,
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/mapper/DeveloperMapper.java
````java
package com.catalog.developercollectionservice.mapper;

import com.catalog.developercollectionservice.dto.DeveloperRequest;
import com.catalog.developercollectionservice.dto.DeveloperResponse;
import com.catalog.developercollectionservice.entity.Developer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DeveloperMapper {

    @Mapping(target = "id", ignore = true)
    Developer toEntity(DeveloperRequest request);

    DeveloperResponse toResponse(Developer entity);
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/repository/CollectionItemRepository.java
````java
package com.catalog.developercollectionservice.repository;

import com.catalog.developercollectionservice.entity.CollectionItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectionItemRepository extends JpaRepository<CollectionItem, Long> {
    List<CollectionItem> findByDeveloperId(Long developerId);
    boolean existsByDeveloperIdAndResourceId(Long developerId, Long resourceId);
    void deleteByDeveloperIdAndResourceId(Long developerId, Long resourceId);
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/repository/DeveloperRepository.java
````java
package com.catalog.developercollectionservice.repository;

import com.catalog.developercollectionservice.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
    Optional<Developer> findByEmail(String email);
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/service/DeveloperQueryService.java
````java
package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.dto.DeveloperResponse;
import com.catalog.developercollectionservice.mapper.DeveloperMapper;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DeveloperQueryService {

    private final DeveloperRepository developerRepository;
    private final DeveloperMapper developerMapper;

    public List<DeveloperResponse> getAllDevelopers() {
        return developerRepository.findAll().stream()
                .map(developerMapper::toResponse)
                .collect(Collectors.toList());
    }

    public DeveloperResponse getDeveloperById(Long id) {
        return developerRepository.findById(id)
                .map(developerMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Developer not found with ID: " + id));
    }
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/DeveloperCollectionServiceApplication.java
````java
package com.catalog.developercollectionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DeveloperCollectionServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeveloperCollectionServiceApplication.class, args);
    }
}
````

## File: developer-collection-service/src/main/resources/application.yml
````yaml
server:
  port: 8081

spring:
  application:
    name: developer-collection-service
  datasource:
    url: ${DEVELOPER_DATASOURCE_URL}
    username: ${DEVELOPER_DATASOURCE_USERNAME}
    password: ${DEVELOPER_DATASOURCE_PASSWORD}
  jpa:
    hibernate:
      ddl-auto: ${SPRING_JPA_HIBERNATE_DDL_AUTO}
    show-sql: ${SPRING_JPA_SHOW_SQL}
    properties:
      hibernate:
        format_sql: false
        dialect: org.hibernate.dialect.PostgreSQLDialect

# Variabile personalizzata per il client Feign
services:
  resource-catalog:
    url: ${RESOURCE_CATALOG_SERVICE_URL}

springdoc:
  openapi:
    servers:
      - url: ${API_GATEWAY_URL}
        description: "API Gateway"
````

## File: developer-collection-service/src/main/resources/logback-spring.xml
````xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <appender name="CONSOLE_JSON" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>{"timestamp":"%d{yyyy-MM-dd'T'HH:mm:ss.SSSZ}", "level":"%level", "thread":"%thread", "logger":"%logger{36}", "message":"%replace(%msg){'"', '\''}"}%n</pattern>
        </encoder>
    </appender>

    <root level="INFO">
        <appender-ref ref="CONSOLE_JSON" />
    </root>
</configuration>
````

## File: developer-collection-service/src/test/java/com/catalog/developercollectionservice/repository/DeveloperRepositoryTest.java
````java
package com.catalog.developercollectionservice.repository;

import com.catalog.developercollectionservice.entity.Developer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DeveloperRepositoryTest {

    @Autowired
    private DeveloperRepository developerRepository;

    @Test
    void findByEmail_ShouldReturnDeveloper() {
        Developer dev = Developer.builder()
                .nome("Lorenzo")
                .email("lorenzo@test.com")
                .build();
        developerRepository.save(dev);

        Optional<Developer> found = developerRepository.findByEmail("lorenzo@test.com");

        assertTrue(found.isPresent());
        assertEquals("Lorenzo", found.get().getNome());
    }
}
````

## File: developer-collection-service/src/test/java/com/catalog/developercollectionservice/service/DeveloperCommandServiceTest.java
````java
package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.dto.DeveloperRequest;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DeveloperCommandServiceTest {

    @Mock
    private DeveloperRepository developerRepository;

    @InjectMocks
    private DeveloperCommandService commandService;

    @Test
    void createDeveloper_ShouldSaveAndReturnId() {
        DeveloperRequest request = new DeveloperRequest("Test Developer", "test@example.com");
        Developer savedDeveloper = new Developer();
        savedDeveloper.setId(1L);
        savedDeveloper.setNome("Test Developer");
        savedDeveloper.setEmail("test@example.com");

        when(developerRepository.save(any(Developer.class))).thenReturn(savedDeveloper);

        Long resultId = commandService.createDeveloper(request);

        assertEquals(1L, resultId);
        verify(developerRepository).save(any(Developer.class));
    }
}
````

## File: developer-collection-service/src/test/java/com/catalog/developercollectionservice/service/DeveloperQueryServiceTest.java
````java
package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.dto.DeveloperResponse;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.mapper.DeveloperMapper;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DeveloperQueryServiceTest {

    @Mock
    private DeveloperRepository developerRepository;

    @Mock
    private DeveloperMapper developerMapper;

    @InjectMocks
    private DeveloperQueryService queryService;

    @Test
    void getAllDevelopers_ShouldReturnMappedResponses() {
        Developer developer = new Developer();
        developer.setId(1L);
        DeveloperResponse response = new DeveloperResponse(1L, "Test Developer", "test@example.com");

        when(developerRepository.findAll()).thenReturn(List.of(developer));
        when(developerMapper.toResponse(developer)).thenReturn(response);

        List<DeveloperResponse> result = queryService.getAllDevelopers();

        assertEquals(1, result.size());
        assertEquals(1L, result.get(0).id());
        verify(developerRepository).findAll();
    }

    @Test
    void getDeveloperById_WhenFound_ShouldReturnResponse() {
        Developer developer = new Developer();
        developer.setId(1L);
        DeveloperResponse response = new DeveloperResponse(1L, "Test Developer", "test@example.com");

        when(developerRepository.findById(1L)).thenReturn(Optional.of(developer));
        when(developerMapper.toResponse(developer)).thenReturn(response);

        DeveloperResponse result = queryService.getDeveloperById(1L);

        assertEquals(1L, result.id());
        verify(developerRepository).findById(1L);
    }

    @Test
    void getDeveloperById_WhenNotFound_ShouldThrowException() {
        when(developerRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> queryService.getDeveloperById(99L));
    }
}
````

## File: developer-collection-service/src/test/java/com/catalog/developercollectionservice/DeveloperCollectionServiceApplicationTests.java
````java
package com.catalog.developercollectionservice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Disabilitato per evitare la dipendenza dal database PostgreSQL durante gli unit test")
class DeveloperCollectionServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
````

## File: developer-collection-service/.gitattributes
````
/mvnw text eol=lf
*.cmd text eol=crlf
````

## File: developer-collection-service/.gitignore
````
HELP.md
target/
.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
!**/src/test/**/target/

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/
build/
!**/src/main/**/build/
!**/src/test/**/build/

### VS Code ###
.vscode/
````

## File: developer-collection-service/Dockerfile
````
# Stage 1: Build
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
````

## File: developer-collection-service/mvnw
````
#!/bin/sh
# ----------------------------------------------------------------------------
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
# ----------------------------------------------------------------------------

# ----------------------------------------------------------------------------
# Apache Maven Wrapper startup batch script, version 3.3.4
#
# Optional ENV vars
# -----------------
#   JAVA_HOME - location of a JDK home dir, required when download maven via java source
#   MVNW_REPOURL - repo url base for downloading maven distribution
#   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
#   MVNW_VERBOSE - true: enable verbose log; debug: trace the mvnw script; others: silence the output
# ----------------------------------------------------------------------------

set -euf
[ "${MVNW_VERBOSE-}" != debug ] || set -x

# OS specific support.
native_path() { printf %s\\n "$1"; }
case "$(uname)" in
CYGWIN* | MINGW*)
  [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME")"
  native_path() { cygpath --path --windows "$1"; }
  ;;
esac

# set JAVACMD and JAVACCMD
set_java_home() {
  # For Cygwin and MinGW, ensure paths are in Unix format before anything is touched
  if [ -n "${JAVA_HOME-}" ]; then
    if [ -x "$JAVA_HOME/jre/sh/java" ]; then
      # IBM's JDK on AIX uses strange locations for the executables
      JAVACMD="$JAVA_HOME/jre/sh/java"
      JAVACCMD="$JAVA_HOME/jre/sh/javac"
    else
      JAVACMD="$JAVA_HOME/bin/java"
      JAVACCMD="$JAVA_HOME/bin/javac"

      if [ ! -x "$JAVACMD" ] || [ ! -x "$JAVACCMD" ]; then
        echo "The JAVA_HOME environment variable is not defined correctly, so mvnw cannot run." >&2
        echo "JAVA_HOME is set to \"$JAVA_HOME\", but \"\$JAVA_HOME/bin/java\" or \"\$JAVA_HOME/bin/javac\" does not exist." >&2
        return 1
      fi
    fi
  else
    JAVACMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v java
    )" || :
    JAVACCMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v javac
    )" || :

    if [ ! -x "${JAVACMD-}" ] || [ ! -x "${JAVACCMD-}" ]; then
      echo "The java/javac command does not exist in PATH nor is JAVA_HOME set, so mvnw cannot run." >&2
      return 1
    fi
  fi
}

# hash string like Java String::hashCode
hash_string() {
  str="${1:-}" h=0
  while [ -n "$str" ]; do
    char="${str%"${str#?}"}"
    h=$(((h * 31 + $(LC_CTYPE=C printf %d "'$char")) % 4294967296))
    str="${str#?}"
  done
  printf %x\\n $h
}

verbose() { :; }
[ "${MVNW_VERBOSE-}" != true ] || verbose() { printf %s\\n "${1-}"; }

die() {
  printf %s\\n "$1" >&2
  exit 1
}

trim() {
  # MWRAPPER-139:
  #   Trims trailing and leading whitespace, carriage returns, tabs, and linefeeds.
  #   Needed for removing poorly interpreted newline sequences when running in more
  #   exotic environments such as mingw bash on Windows.
  printf "%s" "${1}" | tr -d '[:space:]'
}

scriptDir="$(dirname "$0")"
scriptName="$(basename "$0")"

# parse distributionUrl and optional distributionSha256Sum, requires .mvn/wrapper/maven-wrapper.properties
while IFS="=" read -r key value; do
  case "${key-}" in
  distributionUrl) distributionUrl=$(trim "${value-}") ;;
  distributionSha256Sum) distributionSha256Sum=$(trim "${value-}") ;;
  esac
done <"$scriptDir/.mvn/wrapper/maven-wrapper.properties"
[ -n "${distributionUrl-}" ] || die "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"

case "${distributionUrl##*/}" in
maven-mvnd-*bin.*)
  MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/
  case "${PROCESSOR_ARCHITECTURE-}${PROCESSOR_ARCHITEW6432-}:$(uname -a)" in
  *AMD64:CYGWIN* | *AMD64:MINGW*) distributionPlatform=windows-amd64 ;;
  :Darwin*x86_64) distributionPlatform=darwin-amd64 ;;
  :Darwin*arm64) distributionPlatform=darwin-aarch64 ;;
  :Linux*x86_64*) distributionPlatform=linux-amd64 ;;
  *)
    echo "Cannot detect native platform for mvnd on $(uname)-$(uname -m), use pure java version" >&2
    distributionPlatform=linux-amd64
    ;;
  esac
  distributionUrl="${distributionUrl%-bin.*}-$distributionPlatform.zip"
  ;;
maven-mvnd-*) MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/ ;;
*) MVN_CMD="mvn${scriptName#mvnw}" _MVNW_REPO_PATTERN=/org/apache/maven/ ;;
esac

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
[ -z "${MVNW_REPOURL-}" ] || distributionUrl="$MVNW_REPOURL$_MVNW_REPO_PATTERN${distributionUrl#*"$_MVNW_REPO_PATTERN"}"
distributionUrlName="${distributionUrl##*/}"
distributionUrlNameMain="${distributionUrlName%.*}"
distributionUrlNameMain="${distributionUrlNameMain%-bin}"
MAVEN_USER_HOME="${MAVEN_USER_HOME:-${HOME}/.m2}"
MAVEN_HOME="${MAVEN_USER_HOME}/wrapper/dists/${distributionUrlNameMain-}/$(hash_string "$distributionUrl")"

exec_maven() {
  unset MVNW_VERBOSE MVNW_USERNAME MVNW_PASSWORD MVNW_REPOURL || :
  exec "$MAVEN_HOME/bin/$MVN_CMD" "$@" || die "cannot exec $MAVEN_HOME/bin/$MVN_CMD"
}

if [ -d "$MAVEN_HOME" ]; then
  verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  exec_maven "$@"
fi

case "${distributionUrl-}" in
*?-bin.zip | *?maven-mvnd-?*-?*.zip) ;;
*) die "distributionUrl is not valid, must match *-bin.zip or maven-mvnd-*.zip, but found '${distributionUrl-}'" ;;
esac

# prepare tmp dir
if TMP_DOWNLOAD_DIR="$(mktemp -d)" && [ -d "$TMP_DOWNLOAD_DIR" ]; then
  clean() { rm -rf -- "$TMP_DOWNLOAD_DIR"; }
  trap clean HUP INT TERM EXIT
else
  die "cannot create temp dir"
fi

mkdir -p -- "${MAVEN_HOME%/*}"

# Download and Install Apache Maven
verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
verbose "Downloading from: $distributionUrl"
verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

# select .zip or .tar.gz
if ! command -v unzip >/dev/null; then
  distributionUrl="${distributionUrl%.zip}.tar.gz"
  distributionUrlName="${distributionUrl##*/}"
fi

# verbose opt
__MVNW_QUIET_WGET=--quiet __MVNW_QUIET_CURL=--silent __MVNW_QUIET_UNZIP=-q __MVNW_QUIET_TAR=''
[ "${MVNW_VERBOSE-}" != true ] || __MVNW_QUIET_WGET='' __MVNW_QUIET_CURL='' __MVNW_QUIET_UNZIP='' __MVNW_QUIET_TAR=v

# normalize http auth
case "${MVNW_PASSWORD:+has-password}" in
'') MVNW_USERNAME='' MVNW_PASSWORD='' ;;
has-password) [ -n "${MVNW_USERNAME-}" ] || MVNW_USERNAME='' MVNW_PASSWORD='' ;;
esac

if [ -z "${MVNW_USERNAME-}" ] && command -v wget >/dev/null; then
  verbose "Found wget ... using wget"
  wget ${__MVNW_QUIET_WGET:+"$__MVNW_QUIET_WGET"} "$distributionUrl" -O "$TMP_DOWNLOAD_DIR/$distributionUrlName" || die "wget: Failed to fetch $distributionUrl"
elif [ -z "${MVNW_USERNAME-}" ] && command -v curl >/dev/null; then
  verbose "Found curl ... using curl"
  curl ${__MVNW_QUIET_CURL:+"$__MVNW_QUIET_CURL"} -f -L -o "$TMP_DOWNLOAD_DIR/$distributionUrlName" "$distributionUrl" || die "curl: Failed to fetch $distributionUrl"
elif set_java_home; then
  verbose "Falling back to use Java to download"
  javaSource="$TMP_DOWNLOAD_DIR/Downloader.java"
  targetZip="$TMP_DOWNLOAD_DIR/$distributionUrlName"
  cat >"$javaSource" <<-END
	public class Downloader extends java.net.Authenticator
	{
	  protected java.net.PasswordAuthentication getPasswordAuthentication()
	  {
	    return new java.net.PasswordAuthentication( System.getenv( "MVNW_USERNAME" ), System.getenv( "MVNW_PASSWORD" ).toCharArray() );
	  }
	  public static void main( String[] args ) throws Exception
	  {
	    setDefault( new Downloader() );
	    java.nio.file.Files.copy( java.net.URI.create( args[0] ).toURL().openStream(), java.nio.file.Paths.get( args[1] ).toAbsolutePath().normalize() );
	  }
	}
	END
  # For Cygwin/MinGW, switch paths to Windows format before running javac and java
  verbose " - Compiling Downloader.java ..."
  "$(native_path "$JAVACCMD")" "$(native_path "$javaSource")" || die "Failed to compile Downloader.java"
  verbose " - Running Downloader.java ..."
  "$(native_path "$JAVACMD")" -cp "$(native_path "$TMP_DOWNLOAD_DIR")" Downloader "$distributionUrl" "$(native_path "$targetZip")"
fi

# If specified, validate the SHA-256 sum of the Maven distribution zip file
if [ -n "${distributionSha256Sum-}" ]; then
  distributionSha256Result=false
  if [ "$MVN_CMD" = mvnd.sh ]; then
    echo "Checksum validation is not supported for maven-mvnd." >&2
    echo "Please disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  elif command -v sha256sum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | sha256sum -c - >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  elif command -v shasum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | shasum -a 256 -c >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  else
    echo "Checksum validation was requested but neither 'sha256sum' or 'shasum' are available." >&2
    echo "Please install either command, or disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  fi
  if [ $distributionSha256Result = false ]; then
    echo "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised." >&2
    echo "If you updated your Maven version, you need to update the specified distributionSha256Sum property." >&2
    exit 1
  fi
fi

# unzip and move
if command -v unzip >/dev/null; then
  unzip ${__MVNW_QUIET_UNZIP:+"$__MVNW_QUIET_UNZIP"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -d "$TMP_DOWNLOAD_DIR" || die "failed to unzip"
else
  tar xzf${__MVNW_QUIET_TAR:+"$__MVNW_QUIET_TAR"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -C "$TMP_DOWNLOAD_DIR" || die "failed to untar"
fi

# Find the actual extracted directory name (handles snapshots where filename != directory name)
actualDistributionDir=""

# First try the expected directory name (for regular distributions)
if [ -d "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" ]; then
  if [ -f "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain/bin/$MVN_CMD" ]; then
    actualDistributionDir="$distributionUrlNameMain"
  fi
fi

# If not found, search for any directory with the Maven executable (for snapshots)
if [ -z "$actualDistributionDir" ]; then
  # enable globbing to iterate over items
  set +f
  for dir in "$TMP_DOWNLOAD_DIR"/*; do
    if [ -d "$dir" ]; then
      if [ -f "$dir/bin/$MVN_CMD" ]; then
        actualDistributionDir="$(basename "$dir")"
        break
      fi
    fi
  done
  set -f
fi

if [ -z "$actualDistributionDir" ]; then
  verbose "Contents of $TMP_DOWNLOAD_DIR:"
  verbose "$(ls -la "$TMP_DOWNLOAD_DIR")"
  die "Could not find Maven distribution directory in extracted archive"
fi

verbose "Found extracted Maven distribution directory: $actualDistributionDir"
printf %s\\n "$distributionUrl" >"$TMP_DOWNLOAD_DIR/$actualDistributionDir/mvnw.url"
mv -- "$TMP_DOWNLOAD_DIR/$actualDistributionDir" "$MAVEN_HOME" || [ -d "$MAVEN_HOME" ] || die "fail to move MAVEN_HOME"

clean || :
exec_maven "$@"
````

## File: developer-collection-service/mvnw.cmd
````batch
<# : batch portion
@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Apache Maven Wrapper startup batch script, version 3.3.4
@REM
@REM Optional ENV vars
@REM   MVNW_REPOURL - repo url base for downloading maven distribution
@REM   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
@REM   MVNW_VERBOSE - true: enable verbose log; others: silence the output
@REM ----------------------------------------------------------------------------

@IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
@SET __MVNW_CMD__=
@SET __MVNW_ERROR__=
@SET __MVNW_PSMODULEP_SAVE=%PSModulePath%
@SET PSModulePath=
@FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $script='%__MVNW_ARG0_NAME__%'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw '%~f0'))) -NoNewScope}"`) DO @(
  IF "%%A"=="MVN_CMD" (set __MVNW_CMD__=%%B) ELSE IF "%%B"=="" (echo %%A) ELSE (echo %%A=%%B)
)
@SET PSModulePath=%__MVNW_PSMODULEP_SAVE%
@SET __MVNW_PSMODULEP_SAVE=
@SET __MVNW_ARG0_NAME__=
@SET MVNW_USERNAME=
@SET MVNW_PASSWORD=
@IF NOT "%__MVNW_CMD__%"=="" ("%__MVNW_CMD__%" %*)
@echo Cannot start maven from wrapper >&2 && exit /b 1
@GOTO :EOF
: end batch / begin powershell #>

$ErrorActionPreference = "Stop"
if ($env:MVNW_VERBOSE -eq "true") {
  $VerbosePreference = "Continue"
}

# calculate distributionUrl, requires .mvn/wrapper/maven-wrapper.properties
$distributionUrl = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionUrl
if (!$distributionUrl) {
  Write-Error "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"
}

switch -wildcard -casesensitive ( $($distributionUrl -replace '^.*/','') ) {
  "maven-mvnd-*" {
    $USE_MVND = $true
    $distributionUrl = $distributionUrl -replace '-bin\.[^.]*$',"-windows-amd64.zip"
    $MVN_CMD = "mvnd.cmd"
    break
  }
  default {
    $USE_MVND = $false
    $MVN_CMD = $script -replace '^mvnw','mvn'
    break
  }
}

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
if ($env:MVNW_REPOURL) {
  $MVNW_REPO_PATTERN = if ($USE_MVND -eq $False) { "/org/apache/maven/" } else { "/maven/mvnd/" }
  $distributionUrl = "$env:MVNW_REPOURL$MVNW_REPO_PATTERN$($distributionUrl -replace "^.*$MVNW_REPO_PATTERN",'')"
}
$distributionUrlName = $distributionUrl -replace '^.*/',''
$distributionUrlNameMain = $distributionUrlName -replace '\.[^.]*$','' -replace '-bin$',''

$MAVEN_M2_PATH = "$HOME/.m2"
if ($env:MAVEN_USER_HOME) {
  $MAVEN_M2_PATH = "$env:MAVEN_USER_HOME"
}

if (-not (Test-Path -Path $MAVEN_M2_PATH)) {
    New-Item -Path $MAVEN_M2_PATH -ItemType Directory | Out-Null
}

$MAVEN_WRAPPER_DISTS = $null
if ((Get-Item $MAVEN_M2_PATH).Target[0] -eq $null) {
  $MAVEN_WRAPPER_DISTS = "$MAVEN_M2_PATH/wrapper/dists"
} else {
  $MAVEN_WRAPPER_DISTS = (Get-Item $MAVEN_M2_PATH).Target[0] + "/wrapper/dists"
}

$MAVEN_HOME_PARENT = "$MAVEN_WRAPPER_DISTS/$distributionUrlNameMain"
$MAVEN_HOME_NAME = ([System.Security.Cryptography.SHA256]::Create().ComputeHash([byte[]][char[]]$distributionUrl) | ForEach-Object {$_.ToString("x2")}) -join ''
$MAVEN_HOME = "$MAVEN_HOME_PARENT/$MAVEN_HOME_NAME"

if (Test-Path -Path "$MAVEN_HOME" -PathType Container) {
  Write-Verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
  exit $?
}

if (! $distributionUrlNameMain -or ($distributionUrlName -eq $distributionUrlNameMain)) {
  Write-Error "distributionUrl is not valid, must end with *-bin.zip, but found $distributionUrl"
}

# prepare tmp dir
$TMP_DOWNLOAD_DIR_HOLDER = New-TemporaryFile
$TMP_DOWNLOAD_DIR = New-Item -Itemtype Directory -Path "$TMP_DOWNLOAD_DIR_HOLDER.dir"
$TMP_DOWNLOAD_DIR_HOLDER.Delete() | Out-Null
trap {
  if ($TMP_DOWNLOAD_DIR.Exists) {
    try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
    catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
  }
}

New-Item -Itemtype Directory -Path "$MAVEN_HOME_PARENT" -Force | Out-Null

# Download and Install Apache Maven
Write-Verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
Write-Verbose "Downloading from: $distributionUrl"
Write-Verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

$webclient = New-Object System.Net.WebClient
if ($env:MVNW_USERNAME -and $env:MVNW_PASSWORD) {
  $webclient.Credentials = New-Object System.Net.NetworkCredential($env:MVNW_USERNAME, $env:MVNW_PASSWORD)
}
[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
$webclient.DownloadFile($distributionUrl, "$TMP_DOWNLOAD_DIR/$distributionUrlName") | Out-Null

# If specified, validate the SHA-256 sum of the Maven distribution zip file
$distributionSha256Sum = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionSha256Sum
if ($distributionSha256Sum) {
  if ($USE_MVND) {
    Write-Error "Checksum validation is not supported for maven-mvnd. `nPlease disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties."
  }
  Import-Module $PSHOME\Modules\Microsoft.PowerShell.Utility -Function Get-FileHash
  if ((Get-FileHash "$TMP_DOWNLOAD_DIR/$distributionUrlName" -Algorithm SHA256).Hash.ToLower() -ne $distributionSha256Sum) {
    Write-Error "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised. If you updated your Maven version, you need to update the specified distributionSha256Sum property."
  }
}

# unzip and move
Expand-Archive "$TMP_DOWNLOAD_DIR/$distributionUrlName" -DestinationPath "$TMP_DOWNLOAD_DIR" | Out-Null

# Find the actual extracted directory name (handles snapshots where filename != directory name)
$actualDistributionDir = ""

# First try the expected directory name (for regular distributions)
$expectedPath = Join-Path "$TMP_DOWNLOAD_DIR" "$distributionUrlNameMain"
$expectedMvnPath = Join-Path "$expectedPath" "bin/$MVN_CMD"
if ((Test-Path -Path $expectedPath -PathType Container) -and (Test-Path -Path $expectedMvnPath -PathType Leaf)) {
  $actualDistributionDir = $distributionUrlNameMain
}

# If not found, search for any directory with the Maven executable (for snapshots)
if (!$actualDistributionDir) {
  Get-ChildItem -Path "$TMP_DOWNLOAD_DIR" -Directory | ForEach-Object {
    $testPath = Join-Path $_.FullName "bin/$MVN_CMD"
    if (Test-Path -Path $testPath -PathType Leaf) {
      $actualDistributionDir = $_.Name
    }
  }
}

if (!$actualDistributionDir) {
  Write-Error "Could not find Maven distribution directory in extracted archive"
}

Write-Verbose "Found extracted Maven distribution directory: $actualDistributionDir"
Rename-Item -Path "$TMP_DOWNLOAD_DIR/$actualDistributionDir" -NewName $MAVEN_HOME_NAME | Out-Null
try {
  Move-Item -Path "$TMP_DOWNLOAD_DIR/$MAVEN_HOME_NAME" -Destination $MAVEN_HOME_PARENT | Out-Null
} catch {
  if (! (Test-Path -Path "$MAVEN_HOME" -PathType Container)) {
    Write-Error "fail to move MAVEN_HOME"
  }
} finally {
  try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
  catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
}

Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
````

## File: developer-collection-service/pom.xml
````xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.5</version>
        <relativePath/>
    </parent>
    <groupId>com.catalog</groupId>
    <artifactId>developer-collection-service</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>developer-collection-service</name>
    <description>developer-collection-service</description>

    <properties>
        <java.version>17</java.version>
        <spring-cloud.version>2023.0.1</spring-cloud.version>
        <org.mapstruct.version>1.5.5.Final</org.mapstruct.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.5.0</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>

        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>${org.mapstruct.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>${java.version}</source>
                    <target>${java.version}</target>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>${lombok.version}</version>
                        </path>
                        <path>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>${org.mapstruct.version}</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
````

## File: frontend-service/src/assets/labels.ts
````typescript
export const labels = {
    brand: "Dev-Inventory",
    tagline: "Cloud Resource Management",
    navbar: {
        catalog: "Esplora Risorse",
        collection: "Preferiti",
        logout: "Esci"
    },
    forms: {
        categoryTitle: "Nuova Categoria",
        resourceTitle: "Nuova Risorsa",
        name: "Nome",
        desc: "Descrizione",
        url: "URL Documentazione",
        select: "Scegli categoria",
        btn: "Aggiungi"
    },
    dashboard: {
        catalog: "Catalogo Globale",
        collection: "Le Mie Risorse",
        filter: "Filtra per Categoria"
    }
};
````

## File: frontend-service/src/components/header/index.tsx
````typescript
import type { RefineThemedLayoutHeaderProps } from "@refinedev/antd";
import { useGetIdentity } from "@refinedev/core";
import {
  Layout as AntdLayout,
  Avatar,
  Space,
  Switch,
  Typography,
} from "antd";
import React, { useContext } from "react";
import { ColorModeContext } from "../../contexts/color-mode";

const { Text } = Typography;

type IUser = {
  id: number;
  name: string;
  avatar: string;
};

export const Header: React.FC<RefineThemedLayoutHeaderProps> = (props) => {
  const { data: user } = useGetIdentity<IUser>();
  const { mode, setMode } = useContext(ColorModeContext);

  const headerStyles: React.CSSProperties = {
    display: "flex",
    justifyContent: "flex-end",
    alignItems: "center",
    padding: "0px 24px",
    height: "64px",
    position: "sticky",
    top: 0,
    zIndex: 1,
    backdropFilter: "blur(10px)",
    borderBottom: "1px solid rgba(255, 255, 255, 0.1)",
  };

  return (
      <AntdLayout.Header style={headerStyles} {...props}>
        <Space>
          <Switch
              checkedChildren="🌛"
              unCheckedChildren="🔆"
              onChange={() => setMode(mode === "light" ? "dark" : "light")}
              checked={mode === "dark"}
          />
          <Space style={{ marginLeft: "8px" }} size="middle">
            {user?.name && <Text strong>{user.name}</Text>}
            {user?.avatar && <Avatar src={user?.avatar} alt={user?.name} />}
          </Space>
        </Space>
      </AntdLayout.Header>
  );
};
````

## File: frontend-service/src/components/CustomSider.tsx
````typescript
import React from "react";
import { useMenu, useLogout, useNavigation } from "@refinedev/core";
import { Layout, Menu, Typography, theme } from "antd";
import { Button } from "./ui/Primitives";
import { APP_TEXTS } from "../constants/texts";
import { labels } from "../assets/labels";

const { Sider } = Layout;
const { Text } = Typography;

export const CustomSider = () => {
    const { token } = theme.useToken();
    const { menuItems, selectedKey } = useMenu();
    const { mutate: logout } = useLogout();
    const { push } = useNavigation();

    const items = menuItems.map((item) => ({
        key: item.key,
        icon: item.icon,
        label: item.label,
        onClick: () => push(item.route ?? ""),
    }));

    return (
        <Sider
            breakpoint="lg"
            collapsedWidth="0"
            width={280}
            style={{
                backgroundColor: token.colorBgContainer,
                borderRight: `1px solid ${token.colorBorderSecondary}`,
                height: "100vh",
                position: "sticky",
                top: 0,
                left: 0,
            }}
        >
            <div style={{ padding: "24px 16px", height: "100%", display: "flex", flexDirection: "column" }}>
                <div style={{ marginBottom: "40px", textAlign: "center" }}>
                    <Text style={{
                        fontSize: "20px",
                        fontWeight: 900,
                        color: token.colorText,
                        fontStyle: "italic"
                    }}>
                        {labels.brand}
                    </Text>
                </div>

                <Menu
                    mode="inline"
                    selectedKeys={[selectedKey]}
                    items={items}
                    style={{
                        backgroundColor: "transparent",
                        border: "none",
                        flex: 1
                    }}
                />

                <div style={{ marginTop: "auto" }}>
                    <Button
                        variant="danger"
                        onClick={() => logout()}
                        style={{ width: "100%", height: "45px" }}
                    >
                        {labels.navbar.logout}
                    </Button>
                </div>
            </div>
        </Sider>
    );
};
````

## File: frontend-service/src/components/index.ts
````typescript
export { Header } from "./header";
````

## File: frontend-service/src/contexts/color-mode/index.tsx
````typescript
import { RefineThemes } from "@refinedev/antd";
import { ConfigProvider, theme } from "antd";
import {
  type PropsWithChildren,
  createContext,
  useEffect,
  useState,
} from "react";

type ColorModeContextType = {
  mode: string;
  setMode: (mode: string) => void;
};

export const ColorModeContext = createContext<ColorModeContextType>(
    {} as ColorModeContextType
);

export const ColorModeContextProvider: React.FC<PropsWithChildren> = ({
                                                                        children,
                                                                      }) => {
  const colorModeFromLocalStorage = localStorage.getItem("colorMode");
  const isSystemPreferenceDark = window?.matchMedia(
      "(prefers-color-scheme: dark)"
  ).matches;

  const systemPreference = isSystemPreferenceDark ? "dark" : "light";
  const [mode, setMode] = useState(
      colorModeFromLocalStorage || systemPreference
  );

  useEffect(() => {
    window.localStorage.setItem("colorMode", mode);
  }, [mode]);

  const { darkAlgorithm, defaultAlgorithm } = theme;

  return (
      <ColorModeContext.Provider
          value={{
            setMode,
            mode,
          }}
      >
        <ConfigProvider
            theme={{
              ...RefineThemes.Blue,
              algorithm: mode === "light" ? defaultAlgorithm : darkAlgorithm,
              token: {
                colorPrimary: "#A2C7E5",
                colorBgBase: mode === "light" ? "#F0F2F5" : "#141414",
                borderRadius: 24,
                fontFamily: "system-ui, -apple-system, sans-serif",
              },
              components: {
                Layout: {
                  bodyBg: mode === "light" ? "#F0F2F5" : "#141414",
                  headerBg: mode === "light" ? "rgba(255, 255, 255, 0.6)" : "rgba(20, 20, 20, 0.8)",
                },
                Menu: {
                  itemBg: "transparent",
                  itemSelectedBg: "#A2C7E520",
                  itemSelectedColor: "#A2C7E5",
                },
                Card: {
                  colorBgContainer: mode === "light" ? "rgba(255, 255, 255, 0.6)" : "rgba(30, 30, 30, 0.6)",
                }
              }
            }}
        >
          {children}
        </ConfigProvider>
      </ColorModeContext.Provider>
  );
};
````

## File: frontend-service/src/pages/categories/create.tsx
````typescript
import React from "react";
import { Create, useForm } from "@refinedev/antd";
import { Form, Input, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const CategoryCreate = () => {
    const { formProps, saveButtonProps } = useForm({});

    return (
        <Create
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Nuova Categoria</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Nome Categoria"
                        name="nome"
                        rules={[
                            {
                                required: true,
                                message: "Inserisci il nome della categoria",
                            },
                        ]}
                    >
                        <Input placeholder="Es: Frontend, Backend, DevOps..." size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Create>
    );
};
````

## File: frontend-service/src/pages/categories/edit.tsx
````typescript
import React from "react";
import { Edit, useForm } from "@refinedev/antd";
import { Form, Input, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const CategoryEdit = () => {
    const { formProps, saveButtonProps } = useForm({});

    return (
        <Edit
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Modifica Categoria</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Nome Categoria"
                        name="nome"
                        rules={[
                            {
                                required: true,
                                message: "Inserisci il nome della categoria",
                            },
                        ]}
                    >
                        <Input placeholder="Es: Frontend, Backend, DevOps..." size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Edit>
    );
};
````

## File: frontend-service/src/pages/categories/list.tsx
````typescript
import React from "react";
import { List, useTable } from "@refinedev/antd";
import { Table, Space, Typography, Popconfirm } from "antd";
import { ICategory } from "../../interfaces/types";
import { Button, Card } from "../../components/ui/Primitives";
import { useNavigation, useDelete } from "@refinedev/core";

const { Text } = Typography;

export const CategoryList = () => {
    const { edit } = useNavigation();
    const { mutate: deleteCategory } = useDelete();
    const { tableProps } = useTable<ICategory>({
        resource: "categories",
        syncWithLocation: true,
    });

    return (
        <List title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Gestione Categorie</Text>}>
            <Card style={{ padding: 0, overflow: 'hidden' }}>
                <Table {...tableProps} rowKey="id" pagination={{ ...tableProps.pagination, size: "small" }}>
                    <Table.Column
                        dataIndex="id"
                        title="ID"
                        render={(value) => <Text type="secondary">#{value}</Text>}
                        width={80}
                    />
                    <Table.Column
                        dataIndex="nome"
                        title="Nome Categoria"
                        render={(value) => <Text strong style={{ color: '#4A5568' }}>{value}</Text>}
                    />
                    <Table.Column
                        title="Azioni"
                        dataIndex="actions"
                        render={(_, record: ICategory) => (
                            <Space>
                                <Button size="small"
                                        variant="secondary"
                                        style={{ padding: '4px 12px', height: '32px' }}
                                        onClick={() => edit("categories", record.id)}
                                >
                                    Edit
                                </Button>
                                <Popconfirm
                                    title="Sei sicuro di voler eliminare questa categoria?"
                                    onConfirm={() => deleteCategory({ resource: "categories", id: record.id })}
                                    okText="Sì"
                                    cancelText="No"
                                >
                                    <Button size="small"
                                            variant="danger"
                                            style={{ padding: '4px 12px', height: '32px' }}
                                    >
                                        Delete
                                    </Button>
                                </Popconfirm>
                            </Space>
                        )}
                    />
                </Table>
            </Card>
        </List>
    );
};
````

## File: frontend-service/src/pages/collections/create.tsx
````typescript
import React from "react";
import { Create, useForm, useSelect } from "@refinedev/antd";
import { Form, Select, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const CollectionCreate = () => {
    const { formProps, saveButtonProps } = useForm({});

    const { selectProps: developerSelectProps } = useSelect({
        resource: "developers",
        optionLabel: "nome",
    });

    const { selectProps: resourceSelectProps } = useSelect({
        resource: "resources",
        optionLabel: "nome",
    });

    return (
        <Create
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Nuova Assegnazione</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Seleziona Sviluppatore"
                        name="developerId"
                        rules={[{ required: true, message: "Obbligatorio" }]}
                    >
                        <Select {...developerSelectProps} placeholder="Scegli lo sviluppatore" size="large" />
                    </Form.Item>
                    <Form.Item
                        label="Seleziona Risorsa"
                        name="resourceId"
                        rules={[{ required: true, message: "Obbligatorio" }]}
                    >
                        <Select {...resourceSelectProps} placeholder="Scegli la risorsa da assegnare" size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Create>
    );
};
````

## File: frontend-service/src/pages/collections/edit.tsx
````typescript
import React from "react";
import { Edit, useForm, useSelect } from "@refinedev/antd";
import { Form, Select, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const CollectionEdit = () => {
    const { formProps, saveButtonProps, queryResult } = useForm({});

    const { selectProps: developerSelectProps } = useSelect({
        resource: "developers",
        optionLabel: "nome",
        defaultValue: queryResult?.data?.data?.developerId,
    });

    const { selectProps: resourceSelectProps } = useSelect({
        resource: "resources",
        optionLabel: "nome",
        defaultValue: queryResult?.data?.data?.resourceId,
    });

    return (
        <Edit
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Modifica Assegnazione</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Sviluppatore"
                        name="developerId"
                        rules={[{ required: true, message: "Obbligatorio" }]}
                    >
                        <Select {...developerSelectProps} size="large" />
                    </Form.Item>
                    <Form.Item
                        label="Risorsa"
                        name="resourceId"
                        rules={[{ required: true, message: "Obbligatorio" }]}
                    >
                        <Select {...resourceSelectProps} size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Edit>
    );
};
````

## File: frontend-service/src/pages/collections/list.tsx
````typescript
import React from "react";
import { List, useTable } from "@refinedev/antd";
import { Table, Space, Typography, Popconfirm } from "antd";
import { ICollection } from "../../interfaces/types";
import { Button, Card } from "../../components/ui/Primitives";
import { useDelete, useNavigation } from "@refinedev/core";

const { Text } = Typography;

export const CollectionList = () => {
    const { edit } = useNavigation();
    const { mutate: deleteItem } = useDelete();

    // useTable recupera i dati dall'endpoint /api/v1/collections
    const { tableProps } = useTable<ICollection>({
        resource: "collections",
        syncWithLocation: true,
    });

    return (
        <List title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Assegnazioni Risorse</Text>}>
            <Card style={{ padding: 0, overflow: 'hidden' }}>
                <Table {...tableProps} rowKey="id" pagination={{ ...tableProps.pagination, size: "small" }}>
                    <Table.Column
                        dataIndex="id"
                        title="ID"
                        render={(value) => <Text type="secondary">#{value}</Text>}
                        width={80}
                    />
                    <Table.Column
                        dataIndex="developerName" // Deve corrispondere al campo del DTO Java
                        title="Sviluppatore"
                        render={(value) => <Text strong color="#2D3748">{value || "N/D"}</Text>}
                    />
                    <Table.Column
                        dataIndex="resourceName" // Deve corrispondere al campo del DTO Java
                        title="Risorsa Assegnata"
                        render={(value) => <Text>{value || "Caricamento..."}</Text>}
                    />
                    <Table.Column
                        title="Azioni"
                        render={(_, record: ICollection) => (
                            <Space>
                                <Button
                                    size="small"
                                    variant="secondary"
                                    onClick={() => edit("collections", record.id)}
                                >
                                    Edit
                                </Button>
                                <Popconfirm
                                    title="Rimuovere questa risorsa dalla collezione?"
                                    onConfirm={() => deleteItem({ resource: "collections", id: record.id })}
                                    okText="Sì"
                                    cancelText="No"
                                >
                                    <Button size="small" variant="danger">Rimuovi</Button>
                                </Popconfirm>
                            </Space>
                        )}
                    />
                </Table>
            </Card>
        </List>
    );
};
````

## File: frontend-service/src/pages/developers/create.tsx
````typescript
import React from "react";
import { Create, useForm } from "@refinedev/antd";
import { Form, Input, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const DeveloperCreate = () => {
    const { formProps, saveButtonProps } = useForm({});

    return (
        <Create
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Nuovo Sviluppatore</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Nome Completo"
                        name="nome"
                        rules={[{ required: true, message: "Inserisci il nome" }]}
                    >
                        <Input placeholder="Es: Mario Rossi" size="large" />
                    </Form.Item>
                    <Form.Item
                        label="Email"
                        name="email"
                        rules={[
                            { required: true, message: "Inserisci l'email" },
                            { type: "email", message: "Inserisci un indirizzo email valido" }
                        ]}
                    >
                        <Input placeholder="Es: mario.rossi@example.com" size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Create>
    );
};
````

## File: frontend-service/src/pages/developers/edit.tsx
````typescript
import React from "react";
import { Edit, useForm } from "@refinedev/antd";
import { Form, Input, Typography } from "antd";
import { Card } from "../../components/ui/Primitives";

const { Text } = Typography;

export const DeveloperEdit = () => {
    const { formProps, saveButtonProps } = useForm({});

    return (
        <Edit
            saveButtonProps={saveButtonProps}
            title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Modifica Sviluppatore</Text>}
        >
            <Card style={{ padding: '24px' }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label="Nome Completo"
                        name="nome"
                        rules={[{ required: true, message: "Inserisci il nome" }]}
                    >
                        <Input placeholder="Es: Mario Rossi" size="large" />
                    </Form.Item>
                    <Form.Item
                        label="Email"
                        name="email"
                        rules={[
                            { required: true, message: "Inserisci l'email" },
                            { type: "email", message: "Inserisci un indirizzo email valido" }
                        ]}
                    >
                        <Input placeholder="Es: mario.rossi@example.com" size="large" />
                    </Form.Item>
                </Form>
            </Card>
        </Edit>
    );
};
````

## File: frontend-service/src/pages/developers/list.tsx
````typescript
import React from "react";
import { List, useTable, EmailField } from "@refinedev/antd";
import { Table, Space, Typography, Popconfirm } from "antd";
import { IDeveloper } from "../../interfaces/types";
import { Button, Card } from "../../components/ui/Primitives";
import { useNavigation, useDelete } from "@refinedev/core";

const { Text } = Typography;

export const DeveloperList = () => {
    const { edit } = useNavigation();
    const { mutate: deleteDeveloper } = useDelete();
    const { tableProps } = useTable<IDeveloper>({
        resource: "developers",
        syncWithLocation: true,
    });

    return (
        <List title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Gestione Sviluppatori</Text>}>
            <Card style={{ padding: 0, overflow: 'hidden' }}>
                <Table {...tableProps} rowKey="id" pagination={{ ...tableProps.pagination, size: "small" }}>
                    <Table.Column
                        dataIndex="id"
                        title="ID"
                        render={(value) => <Text type="secondary">#{value}</Text>}
                        width={80}
                    />
                    <Table.Column
                        dataIndex="nome"
                        title="Nome Sviluppatore"
                        render={(value) => <Text strong style={{ color: '#4A5568' }}>{value}</Text>}
                    />
                    <Table.Column
                        dataIndex="email"
                        title="Email"
                        render={(value) => <EmailField value={value} />}
                    />
                    <Table.Column
                        title="Azioni"
                        dataIndex="actions"
                        render={(_, record: IDeveloper) => (
                            <Space>
                                <Button size="small"
                                        variant="secondary"
                                        style={{ padding: '4px 12px', height: '32px' }}
                                        onClick={() => edit("developers", record.id)}
                                >
                                    Edit
                                </Button>
                                <Popconfirm
                                    title="Sei sicuro di voler eliminare questo sviluppatore?"
                                    onConfirm={() => deleteDeveloper({ resource: "developers", id: record.id })}
                                    okText="Sì"
                                    cancelText="No"
                                >
                                    <Button size="small"
                                            variant="danger"
                                            style={{ padding: '4px 12px', height: '32px' }}
                                    >
                                        Delete
                                    </Button>
                                </Popconfirm>
                            </Space>
                        )}
                    />
                </Table>
            </Card>
        </List>
    );
};
````

## File: frontend-service/src/pages/resources/create.tsx
````typescript
import React from "react";
import { Create, useForm, useSelect } from "@refinedev/antd";
import { Form, Select } from "antd";
import { Input, Button, Card } from "../../components/ui/Primitives";
import { IResource, ICategory } from "../../interfaces/types";
import { labels } from "../../assets/labels";

export const ResourceCreate = () => {
    // Gestione del form con Refine
    const { formProps, saveButtonProps } = useForm<IResource>();

    // Caricamento dinamico delle categorie per la Select
    const { selectProps: categorySelectProps } = useSelect<ICategory>({
        resource: "categories",
        optionLabel: "nome", // Visualizza il nome nel dropdown
        optionValue: "id",   // Invia l'ID al backend
    });

    return (
        <Create
            title={labels.forms.resourceTitle}
            footerButtons={() => (
                <Button {...saveButtonProps} variant="primary">
                    {labels.forms.btn}
                </Button>
            )}
        >
            <Card style={{ padding: "32px" }}>
                <Form {...formProps} layout="vertical">
                    <Form.Item
                        label={labels.forms.name}
                        name="nome"
                        rules={[{ required: true, message: "Il nome è obbligatorio" }]}
                    >
                        <Input placeholder="Es: Spring Boot Starter" />
                    </Form.Item>

                    <Form.Item
                        label={labels.forms.desc}
                        name="descrizione"
                    >
                        <Input placeholder="Breve descrizione della risorsa" />
                    </Form.Item>

                    <Form.Item
                        label={labels.forms.url}
                        name="url"
                        rules={[{ required: true, message: "L'URL è obbligatorio" }]}
                    >
                        <Input placeholder="https://docs.spring.io/..." />
                    </Form.Item>

                    <Form.Item
                        label={labels.forms.select}
                        name="categoryId"
                        rules={[{ required: true, message: "La categoria è obbligatoria" }]}
                    >
                        <Select
                            {...categorySelectProps}
                            placeholder="Seleziona una categoria"
                            style={{ height: '56px' }}
                            // Nuova sintassi AntD 5
                            styles={{ popup: { root: { borderRadius: '16px' } } }}
                        />
                    </Form.Item>
                </Form>
            </Card>
        </Create>
    );
};
````

## File: frontend-service/src/pages/resources/edit.tsx
````typescript
import React from "react";
import { Edit, useForm, useSelect } from "@refinedev/antd";
import { Form, Select } from "antd";
import { Input, Button, Card } from "../../components/ui/Primitives";
import { IResource, ICategory } from "../../interfaces/types";

export const ResourceEdit = () => {
    // Manteniamo IResource per la gestione della query di caricamento
    const { formProps, saveButtonProps, queryResult } = useForm<IResource>();

    // Recuperiamo i dati per popolare i valori di default se necessario
    const resourceData = queryResult?.data?.data;

    const { selectProps: categorySelectProps } = useSelect<ICategory>({
        resource: "categories",
        defaultValue: resourceData?.category?.id,
        optionLabel: "nome",
        optionValue: "id",
    });

    return (
        <Edit
            title="Modifica Risorsa"
            saveButtonProps={saveButtonProps}
            footerButtons={() => (
                <Button {...saveButtonProps} variant="primary">
                    Salva Modifiche
                </Button>
            )}
        >
            <Card style={{ padding: "32px" }}>
                <Form
                    {...formProps}
                    layout="vertical"
                    // Usiamo 'any' per i valori del form per risolvere il conflitto TS2322.
                    // Questo permette di manipolare l'oggetto values liberamente prima del commit.
                    onFinish={(values: any) => {
                        return formProps.onFinish?.({
                            ...values,
                            // Assicuriamo che categoryId sia presente per il DTO ResourceRequest del backend
                            categoryId: values.category?.id || values.categoryId,
                        });
                    }}
                >
                    <Form.Item
                        label="Nome"
                        name="nome"
                        rules={[{ required: true, message: "Il nome è obbligatorio" }]}
                    >
                        <Input />
                    </Form.Item>

                    <Form.Item
                        label="Descrizione"
                        name="descrizione"
                    >
                        <Input />
                    </Form.Item>

                    <Form.Item
                        label="URL Documentazione"
                        name="url"
                        rules={[{ required: true, message: "L'URL è obbligatorio" }]}
                    >
                        <Input />
                    </Form.Item>

                    <Form.Item
                        label="Categoria"
                        name={["category", "id"]} // Mappa direttamente l'ID nidificato nell'oggetto IResource
                        rules={[{ required: true, message: "La categoria è obbligatoria" }]}
                    >
                        <Select
                            {...categorySelectProps}
                            placeholder="Seleziona categoria"
                            style={{ height: '56px' }}
                            styles={{ popup: { root: { borderRadius: '16px' } } }}
                        />
                    </Form.Item>
                </Form>
            </Card>
        </Edit>
    );
};
````

## File: frontend-service/src/pages/resources/list.tsx
````typescript
import React from "react";
import { List, useTable, TagField, DateField } from "@refinedev/antd";
import { Table, Space, Typography, Popconfirm } from "antd";
import { IResource } from "../../interfaces/types";
import { Button, Card } from "../../components/ui/Primitives";
import { useNavigation, useDelete } from "@refinedev/core";

const { Link, Text } = Typography;

export const ResourceList = () => {
    const { edit } = useNavigation();
    const { mutate: deleteResource } = useDelete();
    const { tableProps } = useTable<IResource>({
        syncWithLocation: true,
    });

    return (
        <List title={<Text style={{ fontSize: '24px', fontWeight: 900, color: '#2D3748' }}>Catalogo Risorse</Text>}>
            <Card style={{ padding: 0, overflow: 'hidden' }}>
                <Table {...tableProps} rowKey="id" pagination={{ ...tableProps.pagination, size: "small" }}>
                    <Table.Column
                        dataIndex="nome"
                        title="Risorsa"
                        render={(value) => <Text strong style={{ color: '#4A5568' }}>{value}</Text>}
                    />
                    <Table.Column
                        dataIndex="descrizione"
                        title="Descrizione"
                        render={(value) => <Text type="secondary">{value || "---"}</Text>}
                    />
                    <Table.Column
                        dataIndex="category"
                        title="Categoria"
                        render={(value) => (
                            <TagField value={value?.nome} color="blue" style={{ borderRadius: '8px', fontWeight: 700 }} />
                        )}
                    />
                    <Table.Column
                        dataIndex="url"
                        title="Link"
                        render={(value) => (
                            <Link href={value} target="_blank" style={{ color: '#A2C7E5' }}>
                                Apri Documentazione
                            </Link>
                        )}
                    />
                    <Table.Column
                        dataIndex="dataInserimento"
                        title="Data"
                        render={(value) => <DateField value={value} format="DD/MM/YYYY" />}
                    />
                    <Table.Column
                        title="Azioni"
                        dataIndex="actions"
                        render={(_, record: IResource) => (
                            <Space>
                                <Button size="small"
                                        variant="secondary"
                                        style={{ padding: '4px 12px', height: '32px' }}
                                        onClick={() => edit("resources", record.id)}
                                >
                                    Edit
                                </Button>
                                <Popconfirm
                                    title="Sei sicuro di voler eliminare questa risorsa?"
                                    onConfirm={() => deleteResource({ resource: "resources", id: record.id })}
                                    okText="Sì"
                                    cancelText="No"
                                >
                                    <Button size="small"
                                            variant="danger"
                                            style={{ padding: '4px 12px', height: '32px' }}
                                    >
                                        Delete
                                    </Button>
                                </Popconfirm>
                            </Space>
                        )}
                    />
                </Table>
            </Card>
        </List>
    );
};
````

## File: frontend-service/src/pages/Login.tsx
````typescript
import React from "react";
import { useLogin } from "@refinedev/core";
import { Form } from "antd";
import { Input, Button, Card } from "../components/ui/Primitives";
import { labels } from "../assets/labels";

export const Login = () => {
    const { mutate: login, isPending } = useLogin();

    const onFinish = (values: any) => {
        login({ email: values.email, password: values.password });
    };

    const styles = {
        container: {
            minHeight: '100vh',
            backgroundColor: '#F0F2F5',
            display: 'flex',
            overflow: 'hidden',
            fontFamily: 'system-ui, -apple-system, sans-serif',
            position: 'relative' as const,
        },
        backgroundBlob1: {
            position: 'absolute' as const,
            top: '-10%',
            left: '-10%',
            width: '50%',
            height: '50%',
            backgroundColor: 'rgba(162, 199, 229, 0.2)',
            filter: 'blur(120px)',
            borderRadius: '50%',
            pointerEvents: 'none' as const,
            zIndex: 0,
        },
        backgroundBlob2: {
            position: 'absolute' as const,
            bottom: '-10%',
            right: '-10%',
            width: '60%',
            height: '60%',
            backgroundColor: 'rgba(186, 230, 253, 0.2)',
            filter: 'blur(150px)',
            borderRadius: '50%',
            pointerEvents: 'none' as const,
            zIndex: 0,
        },
        contentWrapper: {
            flex: 1,
            position: 'relative' as const,
            zIndex: 10,
            display: 'flex',
            alignItems: 'center',
            justifyContent: 'center',
            padding: '24px',
        },
        formContainer: {
            width: '100%',
            maxWidth: '448px',
        },
        header: {
            display: 'flex',
            flexDirection: 'column' as const,
            alignItems: 'center',
            gap: '16px',
            marginBottom: '40px',
        },
        logoBox: {
            width: '80px',
            height: '80px',
            background: 'linear-gradient(to bottom right, #A2C7E5, #bae6fd)',
            borderRadius: '24px',
            boxShadow: '0 10px 15px -3px rgba(162,199,229,0.3)',
            transform: 'rotate(3deg)',
            display: 'flex',
            alignItems: 'center',
            justifyContent: 'center',
        },
        logoText: {
            fontSize: '30px',
            color: 'white',
            fontWeight: 900,
            textShadow: '0 4px 6px rgba(0,0,0,0.1)',
        },
        brandTitle: {
            fontSize: '36px',
            fontWeight: 900,
            color: '#2D3748',
            letterSpacing: '-0.05em',
            fontStyle: 'italic',
            margin: 0,
        },
        subtitle: {
            color: '#a1a1aa',
            fontWeight: 700,
            fontSize: '12px',
            letterSpacing: '0.3em',
            textTransform: 'uppercase' as const,
            margin: 0,
        },
        footerText: {
            marginTop: '32px',
            textAlign: 'center' as const,
            fontSize: '12px',
            fontWeight: 700,
            color: '#a1a1aa',
            letterSpacing: '0.1em',
        }
    };

    return (
        <div style={styles.container}>
            <div style={styles.backgroundBlob1} />
            <div style={styles.backgroundBlob2} />

            <div style={styles.contentWrapper}>
                <div style={styles.formContainer}>
                    <div style={styles.header}>
                        <div style={styles.logoBox}>
                            <span style={styles.logoText}>DI</span>
                        </div>
                        <h1 style={styles.brandTitle}>{labels.brand}</h1>
                        <p style={styles.subtitle}>System Access</p>
                    </div>

                    <Card style={{ padding: '40px 24px' }}>
                        <Form
                            layout="vertical"
                            onFinish={onFinish}
                            requiredMark={false}
                        >
                            <Form.Item
                                name="email"
                                rules={[{ required: true, message: 'Inserisci la tua email' }]}
                            >
                                <Input
                                    label="Email"
                                    type="email"
                                    placeholder="developer@onyx.com"
                                />
                            </Form.Item>

                            <Form.Item
                                name="password"
                                rules={[{ required: true, message: 'Inserisci la tua password' }]}
                            >
                                <Input
                                    label="Password"
                                    type="password"
                                    placeholder="••••••••"
                                />
                            </Form.Item>

                            <Form.Item style={{ paddingTop: '16px', marginBottom: 0 }}>
                                <Button
                                    variant="primary"
                                    htmlType="submit"
                                    style={{ width: '100%', height: '56px', fontSize: '16px' }}
                                    disabled={isPending}
                                >
                                    {isPending ? "AUTHENTICATING..." : "ENTER"}
                                </Button>
                            </Form.Item>
                        </Form>
                    </Card>

                    <div style={styles.footerText}>
                        <p>SECURE CONNECTION ESTABLISHED</p>
                    </div>
                </div>
            </div>
        </div>
    );
};
````

## File: frontend-service/src/pages/Register.tsx
````typescript
import React from "react";
import { useRegister } from "@refinedev/core";
import { Form, Input, Typography, Layout, theme } from "antd";
import { Card, Button } from "../components/ui/Primitives";
import { Link } from "react-router-dom";

const { Title, Text } = Typography;

export const Register = () => {
    const { token } = theme.useToken();
    const { mutate: register, isLoading: isPending } = useRegister();

    const onFinish = (values: any) => {
        register(values);
    };

    return (
        <Layout style={{ height: "100vh", justifyContent: "center", alignItems: "center", backgroundColor: "#f0f2f5" }}>
            <Card style={{ width: "400px", padding: "32px", boxShadow: "0 4px 12px rgba(0,0,0,0.1)" }}>
                <div style={{ textAlign: "center", marginBottom: "32px" }}>
                    <Title level={2} style={{ color: "#2D3748", fontWeight: 800, marginBottom: "8px" }}>
                        Crea Account
                    </Title>
                    <Text type="secondary">Inizia a gestire il tuo Inventory Cloud</Text>
                </div>

                <Form layout="vertical" onFinish={onFinish} requiredMark={false}>
                    <Form.Item
                        name="nome"
                        label="Nome"
                        rules={[{ required: true, message: "Inserisci il tuo nome" }]}
                    >
                        <Input size="large" placeholder="Es: Lorenzo" />
                    </Form.Item>

                    <Form.Item
                        name="email"
                        label="Email"
                        rules={[
                            { required: true, message: "Inserisci l'email" },
                            { type: "email", message: "Inserisci un'email valida" }
                        ]}
                    >
                        <Input size="large" placeholder="esempio@email.com" />
                    </Form.Item>

                    <Form.Item
                        name="password"
                        label="Password"
                        rules={[{ required: true, message: "Inserisci la password" }]}
                    >
                        <Input.Password size="large" placeholder="••••••••" />
                    </Form.Item>

                    <Form.Item style={{ marginBottom: "16px" }}>
                        <Button
                            htmlType="submit"
                            size="large"
                            variant="primary"
                            style={{ width: "100%" }}
                            disabled={isPending}
                        >
                            {isPending ? "Registrazione in corso..." : "Registrati"}
                        </Button>
                    </Form.Item>
                </Form>

                <div style={{ textAlign: "center" }}>
                    <Text type="secondary">
                        Hai già un account? <Link to="/login" style={{ color: token.colorPrimary, fontWeight: 600 }}>Accedi</Link>
                    </Text>
                </div>
            </Card>
        </Layout>
    );
};
````

## File: frontend-service/src/providers/constants.ts
````typescript
export const API_URL = "https://api.fake-rest.refine.dev";
````

## File: frontend-service/src/index.tsx
````typescript
import React from "react";
import { createRoot } from "react-dom/client";

import App from "./App";

const container = document.getElementById("root") as HTMLElement;
const root = createRoot(container);

root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
````

## File: frontend-service/src/vite-env.d.ts
````typescript
/// <reference types="vite/client" />
````

## File: frontend-service/.npmrc
````
legacy-peer-deps=true
strict-peer-dependencies=false
````

## File: frontend-service/Dockerfile
````
# This Dockerfile uses `serve` npm package to serve the static files with node process.
# You can find the Dockerfile for nginx in the following link:
# https://github.com/refinedev/dockerfiles/blob/main/vite/Dockerfile.nginx
FROM refinedev/node:18 AS base

FROM base as deps

COPY package.json yarn.lock* package-lock.json* pnpm-lock.yaml* .npmrc* ./

RUN \
  if [ -f yarn.lock ]; then yarn --frozen-lockfile; \
  elif [ -f package-lock.json ]; then npm ci; \
  elif [ -f pnpm-lock.yaml ]; then yarn global add pnpm && pnpm i --frozen-lockfile; \
  else echo "Lockfile not found." && exit 1; \
  fi

FROM base as builder

ENV NODE_ENV production

COPY --from=deps /app/refine/node_modules ./node_modules

COPY . .

RUN npm run build

FROM base as runner

ENV NODE_ENV production

RUN npm install -g serve

COPY --from=builder /app/refine/dist ./

USER refine

CMD ["serve"]
````

## File: frontend-service/README.MD
````markdown
# frontend-service

<div align="center" style="margin: 30px;">
    <a href="https://refine.dev">
    <img alt="refine logo" src="https://refine.ams3.cdn.digitaloceanspaces.com/readme/refine-readme-banner.png">
    </a>
</div>
<br/>

This [Refine](https://github.com/refinedev/refine) project was generated with [create refine-app](https://github.com/refinedev/refine/tree/master/packages/create-refine-app).

## Getting Started

A React Framework for building internal tools, admin panels, dashboards & B2B apps with unmatched flexibility ✨

Refine's hooks and components simplifies the development process and eliminates the repetitive tasks by providing industry-standard solutions for crucial aspects of a project, including authentication, access control, routing, networking, state management, and i18n.

## Available Scripts

### Running the development server.

```bash
    npm run dev
```

### Building for production.

```bash
    npm run build
```

### Running the production server.

```bash
    npm run start
```

## Learn More

To learn more about **Refine**, please check out the [Documentation](https://refine.dev/docs)

- **REST Data Provider** [Docs](https://refine.dev/docs/core/providers/data-provider/#overview)
- **Ant Design** [Docs](https://refine.dev/docs/ui-frameworks/antd/tutorial/)
- **React Router** [Docs](https://refine.dev/docs/core/providers/router-provider/)

## License

MIT
````

## File: frontend-service/tsconfig.json
````json
{
  "compilerOptions": {
    "tsBuildInfoFile": "./node_modules/.tmp/tsconfig.tsbuildinfo",
    "target": "ES2020",
    "useDefineForClassFields": true,
    "lib": ["DOM", "DOM.Iterable", "ESNext"],
    "module": "ESNext",
    "skipLibCheck": true,
    "moduleResolution": "bundler",
    "allowImportingTsExtensions": true,
    "moduleDetection": "force",
    "noEmit": true,
    "jsx": "react-jsx",
    "strict": true,
    "noUnusedLocals": false,
    "noUnusedParameters": true,
    "noFallthroughCasesInSwitch": true,
    "noUncheckedSideEffectImports": true
  },
  "include": ["src"]
}
````

## File: frontend-service/tsconfig.node.json
````json
{
  "compilerOptions": {
    "tsBuildInfoFile": "./node_modules/.tmp/tsconfig.node.tsbuildinfo",
    "target": "ES2022",
    "lib": ["ES2023"],
    "module": "ESNext",
    "skipLibCheck": true,

    "moduleResolution": "bundler",
    "allowImportingTsExtensions": true,
    "moduleDetection": "force",
    "noEmit": true,

    "strict": true,
    "noUnusedLocals": true,
    "noUnusedParameters": true,
    "noFallthroughCasesInSwitch": true,
    "noUncheckedSideEffectImports": true
  },
  "include": ["vite.config.ts"]
}
````

## File: frontend-service/vite.config.ts
````typescript
import react from "@vitejs/plugin-react";
import { defineConfig } from "vite";

export default defineConfig({
  plugins: [react()],
});
````

## File: resource-catalog-service/.mvn/wrapper/maven-wrapper.properties
````
wrapperVersion=3.3.4
distributionType=only-script
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.14/apache-maven-3.9.14-bin.zip
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/config/OpenApiConfig.java
````java
package com.catalog.resource_catalog_service.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .addServersItem(new Server()
                        .url("http://localhost")
                        .description("API Gateway"))
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
                .components(new Components()
                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                .name("bearerAuth")
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/dto/CategoryRequest.java
````java
package com.catalog.resource_catalog_service.dto;

import jakarta.validation.constraints.NotBlank;

public record CategoryRequest(
        @NotBlank(message = "Il nome della categoria è obbligatorio")
        String nome
) {}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/dto/CategoryResponse.java
````java
package com.catalog.resource_catalog_service.dto;

public record CategoryResponse(
        Long id,
        String nome
) {}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/dto/ErrorResponse.java
````java
package com.catalog.resource_catalog_service.dto;

import java.time.LocalDateTime;

public record ErrorResponse(
        int status,
        String message,
        LocalDateTime timestamp
) {}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/dto/ResourceRequest.java
````java
package com.catalog.resource_catalog_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ResourceRequest(
        @NotBlank(message = "Il nome è obbligatorio")
        String nome,

        String descrizione,

        @NotBlank(message = "L'URL è obbligatorio")
        String url,

        @NotNull(message = "L'ID della categoria è obbligatorio")
        Long categoryId // Riceviamo l'ID della categoria esistente
) {}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/dto/ResourceResponse.java
````java
package com.catalog.resource_catalog_service.dto;

import java.time.LocalDateTime;

public record ResourceResponse(
        Long id,
        String nome,
        String descrizione,
        String url,
        CategoryResponse category, // Restituiamo i dettagli della categoria
        LocalDateTime dataInserimento
) {}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/entity/Category.java
````java
package com.catalog.resource_catalog_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    // Relazione bidirezionale: una categoria ha molte risorse
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Resource> resources;
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/entity/Resource.java
````java
package com.catalog.resource_catalog_service.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Fondamentale per l'autoincrement in PostgreSQL
    private Long id; // Usiamo Long (classe wrapper) invece di int per gestire i valori null prima della persistenza

    @Column(nullable = false)
    private String nome;

    private String descrizione;

    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "data_inserimento", updatable = false)
    private LocalDateTime dataInserimento;

    @PrePersist
    protected void onCreate() {
        this.dataInserimento = LocalDateTime.now();
    }
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/exception/GlobalExceptionHandler.java
````java
package com.catalog.resource_catalog_service.exception;

import com.catalog.resource_catalog_service.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException ex) {
        ErrorResponse error = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException ex) {
        String errorMessage = ex.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> fieldError.getField() + ": " + fieldError.getDefaultMessage())
                .collect(Collectors.joining(", "));

        ErrorResponse error = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                errorMessage,
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/mapper/CategoryMapper.java
````java
package com.catalog.resource_catalog_service.mapper;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "resources", ignore = true)
    Category toEntity(CategoryRequest request);

    CategoryResponse toResponse(Category entity);
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/mapper/ResourceMapper.java
````java
package com.catalog.resource_catalog_service.mapper;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.entity.Resource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {CategoryMapper.class})
public interface ResourceMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "category", ignore = true) // La categoria verrà settata manualmente nel Service dopo la ricerca a DB
    @Mapping(target = "dataInserimento", ignore = true)
    Resource toEntity(ResourceRequest request);

    ResourceResponse toResponse(Resource entity);
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/repository/CategoryRepository.java
````java
package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Utile per evitare duplicati durante la creazione
    Optional<Category> findByNome(String nome);
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/repository/ResourceRepository.java
````java
package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
    // Qui potremo aggiungere query personalizzate in futuro, es: findByCategoria
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/service/ResourceQueryService.java
````java
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.mapper.ResourceMapper;
import com.catalog.resource_catalog_service.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ResourceQueryService {

    private final ResourceRepository resourceRepository;
    private final ResourceMapper resourceMapper;

    public List<ResourceResponse> getAllResources() {
        return resourceRepository.findAll().stream()
                .map(resourceMapper::toResponse)
                .collect(Collectors.toList());
    }

    public ResourceResponse getResourceById(Long id) {
        return resourceRepository.findById(id)
                .map(resourceMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Resource not found with ID: " + id));
    }
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/test_requests/categories_and_resources.http
````
### 1. Creazione di una Categoria (Necessaria per le risorse)
POST http://localhost:8080/api/v1/categories
Content-Type: application/json

{
  "nome": "Frameworks"
}

### 2. Recupero Categorie (Per verificare l'ID generato, es: 1)
GET http://localhost:8080/api/v1/categories

### 3. Creazione di una Risorsa legata alla Categoria 1
POST http://localhost:8080/api/v1/resources
Content-Type: application/json

{
  "nome": "Spring Boot",
  "descrizione": "Evoluzione di Spring per microservizi",
  "url": "https://spring.io/projects/spring-boot",
  "categoryId": 1
}

### 4. Recupero di tutte le risorse (Dovresti vedere la categoria annidata)
GET http://localhost:8080/api/v1/resources
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/test_requests/resources.http
````
### Creazione di una nuova risorsa
POST http://localhost:8080/api/v1/resources
Content-Type: application/json

{
  "nome": "Spring Boot",
  "descrizione": "Framework per lo sviluppo di microservizi Java",
  "url": "https://spring.io/projects/spring-boot",
  "categoria": "Framework"
}

### Recupero di tutte le risorse
GET http://localhost:8080/api/v1/resources

### Recupero di una risorsa specifica per ID (Assicurati che l'ID esista)
GET http://localhost:8080/api/v1/resources/1
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/ResourceCatalogServiceApplication.java
````java
package com.catalog.resource_catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResourceCatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceCatalogServiceApplication.class, args);
    }

}
````

## File: resource-catalog-service/src/main/resources/application.yml
````yaml
server:
  port: 8080

spring:
  application:
    name: resource-catalog-service
  datasource:
    url: ${SPRING_DATASOURCE_URL}
    username: ${SPRING_DATASOURCE_USERNAME}
    password: ${SPRING_DATASOURCE_PASSWORD}
  jpa:
    hibernate:
      ddl-auto: ${SPRING_JPA_HIBERNATE_DDL_AUTO}
    show-sql: ${SPRING_JPA_SHOW_SQL}
    properties:
      hibernate:
        format_sql: false
        dialect: org.hibernate.dialect.PostgreSQLDialect

springdoc:
  openapi:
    servers:
      - url: ${API_GATEWAY_URL}
        description: "API Gateway"
````

## File: resource-catalog-service/src/main/resources/logback-spring.xml
````xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <appender name="CONSOLE_JSON" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>{"timestamp":"%d{yyyy-MM-dd'T'HH:mm:ss.SSSZ}", "level":"%level", "thread":"%thread", "logger":"%logger{36}", "message":"%replace(%msg){'"', '\''}"}%n</pattern>
        </encoder>
    </appender>

    <root level="INFO">
        <appender-ref ref="CONSOLE_JSON" />
    </root>
</configuration>
````

## File: resource-catalog-service/src/test/java/com/catalog/resource_catalog_service/controller/ResourceControllerTest.java
````java
package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.service.ResourceCommandService;
import com.catalog.resource_catalog_service.service.ResourceQueryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ResourceController.class)
class ResourceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ResourceCommandService commandService;

    @MockBean
    private ResourceQueryService queryService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void createResource_WhenInvalidRequest_ShouldReturnBadRequest() throws Exception {
        ResourceRequest invalidRequest = new ResourceRequest("", "", "", null);

        mockMvc.perform(post("/api/v1/resources")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(invalidRequest)))
                .andExpect(status().isBadRequest())
                .andExpect(jsonPath("$.status").value(400))
                .andExpect(jsonPath("$.message").exists());
    }

    @Test
    void createResource_WhenValidRequest_ShouldReturnCreated() throws Exception {
        ResourceRequest validRequest = new ResourceRequest("Java Docs", "Documentation", "https://docs.oracle.com", 1L);
        when(commandService.createResource(any())).thenReturn(1L);

        mockMvc.perform(post("/api/v1/resources")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(validRequest)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$").value(1));
    }
}
````

## File: resource-catalog-service/src/test/java/com/catalog/resource_catalog_service/repository/CategoryRepositoryTest.java
````java
package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void findByNome_ShouldReturnCategory() {
        Category category = new Category();
        category.setNome("Backend");
        categoryRepository.save(category);

        Optional<Category> found = categoryRepository.findByNome("Backend");

        assertTrue(found.isPresent());
        assertEquals("Backend", found.get().getNome());
    }
}
````

## File: resource-catalog-service/src/test/java/com/catalog/resource_catalog_service/repository/ResourceRepositoryTest.java
````java
package com.catalog.resource_catalog_service.repository;

import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ResourceRepositoryTest {

    @Autowired
    private ResourceRepository resourceRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void saveResource_ShouldPersistWithCategory() {
        Category category = new Category();
        category.setNome("DevOps");
        category = categoryRepository.save(category);

        Resource resource = new Resource();
        resource.setNome("Docker Docs");
        resource.setUrl("https://docs.docker.com");
        resource.setCategory(category);

        Resource saved = resourceRepository.save(resource);

        assertNotNull(saved.getId());
        assertEquals("DevOps", saved.getCategory().getNome());
        assertNotNull(saved.getDataInserimento());
    }
}
````

## File: resource-catalog-service/src/test/java/com/catalog/resource_catalog_service/service/CategoryCommandServiceTest.java
````java
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoryCommandServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryCommandService commandService;

    @Test
    void createCategory_ShouldSaveAndReturnId() {
        CategoryRequest request = new CategoryRequest("Cloud Infrastructure");
        Category savedCategory = new Category();
        savedCategory.setId(1L);
        savedCategory.setNome("Cloud Infrastructure");

        when(categoryRepository.save(any(Category.class))).thenReturn(savedCategory);

        Long resultId = commandService.createCategory(request);

        assertEquals(1L, resultId);
        verify(categoryRepository).save(any(Category.class));
    }
}
````

## File: resource-catalog-service/src/test/java/com/catalog/resource_catalog_service/service/CategoryQueryServiceTest.java
````java
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.mapper.CategoryMapper;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoryQueryServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @Mock
    private CategoryMapper categoryMapper;

    @InjectMocks
    private CategoryQueryService queryService;

    @Test
    void getAllCategories_ShouldReturnMappedResponses() {
        Category category = new Category();
        category.setId(1L);
        category.setNome("Cloud Infrastructure");

        CategoryResponse response = new CategoryResponse(1L, "Cloud Infrastructure");

        when(categoryRepository.findAll()).thenReturn(List.of(category));
        when(categoryMapper.toResponse(category)).thenReturn(response);

        List<CategoryResponse> result = queryService.getAllCategories();

        assertEquals(1, result.size());
        assertEquals(1L, result.get(0).id());
        assertEquals("Cloud Infrastructure", result.get(0).nome());

        verify(categoryRepository).findAll();
        verify(categoryMapper).toResponse(category);
    }
}
````

## File: resource-catalog-service/src/test/java/com/catalog/resource_catalog_service/service/ResourceCommandServiceTest.java
````java
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Resource;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import com.catalog.resource_catalog_service.repository.ResourceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ResourceCommandServiceTest {

    @Mock
    private ResourceRepository resourceRepository;

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private ResourceCommandService commandService;

    @Test
    void createResource_ShouldSaveAndReturnId() {
        ResourceRequest request = new ResourceRequest("Spring Boot Guide", "A comprehensive guide", "http://spring.io", 1L);
        Category category = new Category();
        category.setId(1L);

        Resource savedResource = new Resource();
        savedResource.setId(10L);

        when(categoryRepository.findById(1L)).thenReturn(Optional.of(category));
        when(resourceRepository.save(any(Resource.class))).thenReturn(savedResource);

        Long resultId = commandService.createResource(request);

        assertEquals(10L, resultId);
        verify(categoryRepository).findById(1L);
        verify(resourceRepository).save(any(Resource.class));
    }

    @Test
    void createResource_WhenCategoryNotFound_ShouldThrowException() {
        ResourceRequest request = new ResourceRequest("Test Resource", "Desc", "url", 99L);

        when(categoryRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> commandService.createResource(request));
    }
}
````

## File: resource-catalog-service/src/test/java/com/catalog/resource_catalog_service/service/ResourceQueryServiceTest.java
````java
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.entity.Resource;
import com.catalog.resource_catalog_service.mapper.ResourceMapper;
import com.catalog.resource_catalog_service.repository.ResourceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ResourceQueryServiceTest {

    @Mock
    private ResourceRepository resourceRepository;

    @Mock
    private ResourceMapper resourceMapper;

    @InjectMocks
    private ResourceQueryService queryService;

    @Test
    void getAllResources_ShouldReturnMappedResponses() {
        Resource resource = new Resource();
        resource.setId(1L);
        ResourceResponse response = new ResourceResponse(1L, "Test", "Desc", "url", new CategoryResponse(1L, "Cat"), LocalDateTime.now());

        when(resourceRepository.findAll()).thenReturn(List.of(resource));
        when(resourceMapper.toResponse(resource)).thenReturn(response);

        List<ResourceResponse> result = queryService.getAllResources();

        assertEquals(1, result.size());
        assertEquals(1L, result.get(0).id());
        verify(resourceRepository).findAll();
    }

    @Test
    void getResourceById_WhenFound_ShouldReturnResponse() {
        Resource resource = new Resource();
        resource.setId(1L);
        ResourceResponse response = new ResourceResponse(1L, "Test", "Desc", "url", new CategoryResponse(1L, "Cat"), LocalDateTime.now());

        when(resourceRepository.findById(1L)).thenReturn(Optional.of(resource));
        when(resourceMapper.toResponse(resource)).thenReturn(response);

        ResourceResponse result = queryService.getResourceById(1L);

        assertEquals(1L, result.id());
        verify(resourceRepository).findById(1L);
    }

    @Test
    void getResourceById_WhenNotFound_ShouldThrowException() {
        when(resourceRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(RuntimeException.class, () -> queryService.getResourceById(99L));
    }
}
````

## File: resource-catalog-service/src/test/java/com/catalog/resource_catalog_service/ResourceCatalogServiceApplicationTests.java
````java
package com.catalog.resource_catalog_service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Disabilitato per evitare la dipendenza dal database PostgreSQL durante gli unit test")
class ResourceCatalogServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
````

## File: resource-catalog-service/.gitattributes
````
/mvnw text eol=lf
*.cmd text eol=crlf
````

## File: resource-catalog-service/.gitignore
````
HELP.md
target/
.mvn/wrapper/maven-wrapper.jar
!**/src/main/**/target/
!**/src/test/**/target/

### STS ###
.apt_generated
.classpath
.factorypath
.project
.settings
.springBeans
.sts4-cache

### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr

### NetBeans ###
/nbproject/private/
/nbbuild/
/dist/
/nbdist/
/.nb-gradle/
build/
!**/src/main/**/build/
!**/src/test/**/build/

### VS Code ###
.vscode/
````

## File: resource-catalog-service/Dockerfile
````
# Stage 1: Build
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copia il pom e scarica le dipendenze (ottimizza la cache)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia i sorgenti e builda
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
# Prendi il jar generato nello stage precedente
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
````

## File: resource-catalog-service/mvnw
````
#!/bin/sh
# ----------------------------------------------------------------------------
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
# ----------------------------------------------------------------------------

# ----------------------------------------------------------------------------
# Apache Maven Wrapper startup batch script, version 3.3.4
#
# Optional ENV vars
# -----------------
#   JAVA_HOME - location of a JDK home dir, required when download maven via java source
#   MVNW_REPOURL - repo url base for downloading maven distribution
#   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
#   MVNW_VERBOSE - true: enable verbose log; debug: trace the mvnw script; others: silence the output
# ----------------------------------------------------------------------------

set -euf
[ "${MVNW_VERBOSE-}" != debug ] || set -x

# OS specific support.
native_path() { printf %s\\n "$1"; }
case "$(uname)" in
CYGWIN* | MINGW*)
  [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME")"
  native_path() { cygpath --path --windows "$1"; }
  ;;
esac

# set JAVACMD and JAVACCMD
set_java_home() {
  # For Cygwin and MinGW, ensure paths are in Unix format before anything is touched
  if [ -n "${JAVA_HOME-}" ]; then
    if [ -x "$JAVA_HOME/jre/sh/java" ]; then
      # IBM's JDK on AIX uses strange locations for the executables
      JAVACMD="$JAVA_HOME/jre/sh/java"
      JAVACCMD="$JAVA_HOME/jre/sh/javac"
    else
      JAVACMD="$JAVA_HOME/bin/java"
      JAVACCMD="$JAVA_HOME/bin/javac"

      if [ ! -x "$JAVACMD" ] || [ ! -x "$JAVACCMD" ]; then
        echo "The JAVA_HOME environment variable is not defined correctly, so mvnw cannot run." >&2
        echo "JAVA_HOME is set to \"$JAVA_HOME\", but \"\$JAVA_HOME/bin/java\" or \"\$JAVA_HOME/bin/javac\" does not exist." >&2
        return 1
      fi
    fi
  else
    JAVACMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v java
    )" || :
    JAVACCMD="$(
      'set' +e
      'unset' -f command 2>/dev/null
      'command' -v javac
    )" || :

    if [ ! -x "${JAVACMD-}" ] || [ ! -x "${JAVACCMD-}" ]; then
      echo "The java/javac command does not exist in PATH nor is JAVA_HOME set, so mvnw cannot run." >&2
      return 1
    fi
  fi
}

# hash string like Java String::hashCode
hash_string() {
  str="${1:-}" h=0
  while [ -n "$str" ]; do
    char="${str%"${str#?}"}"
    h=$(((h * 31 + $(LC_CTYPE=C printf %d "'$char")) % 4294967296))
    str="${str#?}"
  done
  printf %x\\n $h
}

verbose() { :; }
[ "${MVNW_VERBOSE-}" != true ] || verbose() { printf %s\\n "${1-}"; }

die() {
  printf %s\\n "$1" >&2
  exit 1
}

trim() {
  # MWRAPPER-139:
  #   Trims trailing and leading whitespace, carriage returns, tabs, and linefeeds.
  #   Needed for removing poorly interpreted newline sequences when running in more
  #   exotic environments such as mingw bash on Windows.
  printf "%s" "${1}" | tr -d '[:space:]'
}

scriptDir="$(dirname "$0")"
scriptName="$(basename "$0")"

# parse distributionUrl and optional distributionSha256Sum, requires .mvn/wrapper/maven-wrapper.properties
while IFS="=" read -r key value; do
  case "${key-}" in
  distributionUrl) distributionUrl=$(trim "${value-}") ;;
  distributionSha256Sum) distributionSha256Sum=$(trim "${value-}") ;;
  esac
done <"$scriptDir/.mvn/wrapper/maven-wrapper.properties"
[ -n "${distributionUrl-}" ] || die "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"

case "${distributionUrl##*/}" in
maven-mvnd-*bin.*)
  MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/
  case "${PROCESSOR_ARCHITECTURE-}${PROCESSOR_ARCHITEW6432-}:$(uname -a)" in
  *AMD64:CYGWIN* | *AMD64:MINGW*) distributionPlatform=windows-amd64 ;;
  :Darwin*x86_64) distributionPlatform=darwin-amd64 ;;
  :Darwin*arm64) distributionPlatform=darwin-aarch64 ;;
  :Linux*x86_64*) distributionPlatform=linux-amd64 ;;
  *)
    echo "Cannot detect native platform for mvnd on $(uname)-$(uname -m), use pure java version" >&2
    distributionPlatform=linux-amd64
    ;;
  esac
  distributionUrl="${distributionUrl%-bin.*}-$distributionPlatform.zip"
  ;;
maven-mvnd-*) MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/ ;;
*) MVN_CMD="mvn${scriptName#mvnw}" _MVNW_REPO_PATTERN=/org/apache/maven/ ;;
esac

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
[ -z "${MVNW_REPOURL-}" ] || distributionUrl="$MVNW_REPOURL$_MVNW_REPO_PATTERN${distributionUrl#*"$_MVNW_REPO_PATTERN"}"
distributionUrlName="${distributionUrl##*/}"
distributionUrlNameMain="${distributionUrlName%.*}"
distributionUrlNameMain="${distributionUrlNameMain%-bin}"
MAVEN_USER_HOME="${MAVEN_USER_HOME:-${HOME}/.m2}"
MAVEN_HOME="${MAVEN_USER_HOME}/wrapper/dists/${distributionUrlNameMain-}/$(hash_string "$distributionUrl")"

exec_maven() {
  unset MVNW_VERBOSE MVNW_USERNAME MVNW_PASSWORD MVNW_REPOURL || :
  exec "$MAVEN_HOME/bin/$MVN_CMD" "$@" || die "cannot exec $MAVEN_HOME/bin/$MVN_CMD"
}

if [ -d "$MAVEN_HOME" ]; then
  verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  exec_maven "$@"
fi

case "${distributionUrl-}" in
*?-bin.zip | *?maven-mvnd-?*-?*.zip) ;;
*) die "distributionUrl is not valid, must match *-bin.zip or maven-mvnd-*.zip, but found '${distributionUrl-}'" ;;
esac

# prepare tmp dir
if TMP_DOWNLOAD_DIR="$(mktemp -d)" && [ -d "$TMP_DOWNLOAD_DIR" ]; then
  clean() { rm -rf -- "$TMP_DOWNLOAD_DIR"; }
  trap clean HUP INT TERM EXIT
else
  die "cannot create temp dir"
fi

mkdir -p -- "${MAVEN_HOME%/*}"

# Download and Install Apache Maven
verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
verbose "Downloading from: $distributionUrl"
verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

# select .zip or .tar.gz
if ! command -v unzip >/dev/null; then
  distributionUrl="${distributionUrl%.zip}.tar.gz"
  distributionUrlName="${distributionUrl##*/}"
fi

# verbose opt
__MVNW_QUIET_WGET=--quiet __MVNW_QUIET_CURL=--silent __MVNW_QUIET_UNZIP=-q __MVNW_QUIET_TAR=''
[ "${MVNW_VERBOSE-}" != true ] || __MVNW_QUIET_WGET='' __MVNW_QUIET_CURL='' __MVNW_QUIET_UNZIP='' __MVNW_QUIET_TAR=v

# normalize http auth
case "${MVNW_PASSWORD:+has-password}" in
'') MVNW_USERNAME='' MVNW_PASSWORD='' ;;
has-password) [ -n "${MVNW_USERNAME-}" ] || MVNW_USERNAME='' MVNW_PASSWORD='' ;;
esac

if [ -z "${MVNW_USERNAME-}" ] && command -v wget >/dev/null; then
  verbose "Found wget ... using wget"
  wget ${__MVNW_QUIET_WGET:+"$__MVNW_QUIET_WGET"} "$distributionUrl" -O "$TMP_DOWNLOAD_DIR/$distributionUrlName" || die "wget: Failed to fetch $distributionUrl"
elif [ -z "${MVNW_USERNAME-}" ] && command -v curl >/dev/null; then
  verbose "Found curl ... using curl"
  curl ${__MVNW_QUIET_CURL:+"$__MVNW_QUIET_CURL"} -f -L -o "$TMP_DOWNLOAD_DIR/$distributionUrlName" "$distributionUrl" || die "curl: Failed to fetch $distributionUrl"
elif set_java_home; then
  verbose "Falling back to use Java to download"
  javaSource="$TMP_DOWNLOAD_DIR/Downloader.java"
  targetZip="$TMP_DOWNLOAD_DIR/$distributionUrlName"
  cat >"$javaSource" <<-END
	public class Downloader extends java.net.Authenticator
	{
	  protected java.net.PasswordAuthentication getPasswordAuthentication()
	  {
	    return new java.net.PasswordAuthentication( System.getenv( "MVNW_USERNAME" ), System.getenv( "MVNW_PASSWORD" ).toCharArray() );
	  }
	  public static void main( String[] args ) throws Exception
	  {
	    setDefault( new Downloader() );
	    java.nio.file.Files.copy( java.net.URI.create( args[0] ).toURL().openStream(), java.nio.file.Paths.get( args[1] ).toAbsolutePath().normalize() );
	  }
	}
	END
  # For Cygwin/MinGW, switch paths to Windows format before running javac and java
  verbose " - Compiling Downloader.java ..."
  "$(native_path "$JAVACCMD")" "$(native_path "$javaSource")" || die "Failed to compile Downloader.java"
  verbose " - Running Downloader.java ..."
  "$(native_path "$JAVACMD")" -cp "$(native_path "$TMP_DOWNLOAD_DIR")" Downloader "$distributionUrl" "$(native_path "$targetZip")"
fi

# If specified, validate the SHA-256 sum of the Maven distribution zip file
if [ -n "${distributionSha256Sum-}" ]; then
  distributionSha256Result=false
  if [ "$MVN_CMD" = mvnd.sh ]; then
    echo "Checksum validation is not supported for maven-mvnd." >&2
    echo "Please disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  elif command -v sha256sum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | sha256sum -c - >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  elif command -v shasum >/dev/null; then
    if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | shasum -a 256 -c >/dev/null 2>&1; then
      distributionSha256Result=true
    fi
  else
    echo "Checksum validation was requested but neither 'sha256sum' or 'shasum' are available." >&2
    echo "Please install either command, or disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
    exit 1
  fi
  if [ $distributionSha256Result = false ]; then
    echo "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised." >&2
    echo "If you updated your Maven version, you need to update the specified distributionSha256Sum property." >&2
    exit 1
  fi
fi

# unzip and move
if command -v unzip >/dev/null; then
  unzip ${__MVNW_QUIET_UNZIP:+"$__MVNW_QUIET_UNZIP"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -d "$TMP_DOWNLOAD_DIR" || die "failed to unzip"
else
  tar xzf${__MVNW_QUIET_TAR:+"$__MVNW_QUIET_TAR"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -C "$TMP_DOWNLOAD_DIR" || die "failed to untar"
fi

# Find the actual extracted directory name (handles snapshots where filename != directory name)
actualDistributionDir=""

# First try the expected directory name (for regular distributions)
if [ -d "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" ]; then
  if [ -f "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain/bin/$MVN_CMD" ]; then
    actualDistributionDir="$distributionUrlNameMain"
  fi
fi

# If not found, search for any directory with the Maven executable (for snapshots)
if [ -z "$actualDistributionDir" ]; then
  # enable globbing to iterate over items
  set +f
  for dir in "$TMP_DOWNLOAD_DIR"/*; do
    if [ -d "$dir" ]; then
      if [ -f "$dir/bin/$MVN_CMD" ]; then
        actualDistributionDir="$(basename "$dir")"
        break
      fi
    fi
  done
  set -f
fi

if [ -z "$actualDistributionDir" ]; then
  verbose "Contents of $TMP_DOWNLOAD_DIR:"
  verbose "$(ls -la "$TMP_DOWNLOAD_DIR")"
  die "Could not find Maven distribution directory in extracted archive"
fi

verbose "Found extracted Maven distribution directory: $actualDistributionDir"
printf %s\\n "$distributionUrl" >"$TMP_DOWNLOAD_DIR/$actualDistributionDir/mvnw.url"
mv -- "$TMP_DOWNLOAD_DIR/$actualDistributionDir" "$MAVEN_HOME" || [ -d "$MAVEN_HOME" ] || die "fail to move MAVEN_HOME"

clean || :
exec_maven "$@"
````

## File: resource-catalog-service/mvnw.cmd
````batch
<# : batch portion
@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Apache Maven Wrapper startup batch script, version 3.3.4
@REM
@REM Optional ENV vars
@REM   MVNW_REPOURL - repo url base for downloading maven distribution
@REM   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
@REM   MVNW_VERBOSE - true: enable verbose log; others: silence the output
@REM ----------------------------------------------------------------------------

@IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
@SET __MVNW_CMD__=
@SET __MVNW_ERROR__=
@SET __MVNW_PSMODULEP_SAVE=%PSModulePath%
@SET PSModulePath=
@FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $script='%__MVNW_ARG0_NAME__%'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw '%~f0'))) -NoNewScope}"`) DO @(
  IF "%%A"=="MVN_CMD" (set __MVNW_CMD__=%%B) ELSE IF "%%B"=="" (echo %%A) ELSE (echo %%A=%%B)
)
@SET PSModulePath=%__MVNW_PSMODULEP_SAVE%
@SET __MVNW_PSMODULEP_SAVE=
@SET __MVNW_ARG0_NAME__=
@SET MVNW_USERNAME=
@SET MVNW_PASSWORD=
@IF NOT "%__MVNW_CMD__%"=="" ("%__MVNW_CMD__%" %*)
@echo Cannot start maven from wrapper >&2 && exit /b 1
@GOTO :EOF
: end batch / begin powershell #>

$ErrorActionPreference = "Stop"
if ($env:MVNW_VERBOSE -eq "true") {
  $VerbosePreference = "Continue"
}

# calculate distributionUrl, requires .mvn/wrapper/maven-wrapper.properties
$distributionUrl = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionUrl
if (!$distributionUrl) {
  Write-Error "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"
}

switch -wildcard -casesensitive ( $($distributionUrl -replace '^.*/','') ) {
  "maven-mvnd-*" {
    $USE_MVND = $true
    $distributionUrl = $distributionUrl -replace '-bin\.[^.]*$',"-windows-amd64.zip"
    $MVN_CMD = "mvnd.cmd"
    break
  }
  default {
    $USE_MVND = $false
    $MVN_CMD = $script -replace '^mvnw','mvn'
    break
  }
}

# apply MVNW_REPOURL and calculate MAVEN_HOME
# maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
if ($env:MVNW_REPOURL) {
  $MVNW_REPO_PATTERN = if ($USE_MVND -eq $False) { "/org/apache/maven/" } else { "/maven/mvnd/" }
  $distributionUrl = "$env:MVNW_REPOURL$MVNW_REPO_PATTERN$($distributionUrl -replace "^.*$MVNW_REPO_PATTERN",'')"
}
$distributionUrlName = $distributionUrl -replace '^.*/',''
$distributionUrlNameMain = $distributionUrlName -replace '\.[^.]*$','' -replace '-bin$',''

$MAVEN_M2_PATH = "$HOME/.m2"
if ($env:MAVEN_USER_HOME) {
  $MAVEN_M2_PATH = "$env:MAVEN_USER_HOME"
}

if (-not (Test-Path -Path $MAVEN_M2_PATH)) {
    New-Item -Path $MAVEN_M2_PATH -ItemType Directory | Out-Null
}

$MAVEN_WRAPPER_DISTS = $null
if ((Get-Item $MAVEN_M2_PATH).Target[0] -eq $null) {
  $MAVEN_WRAPPER_DISTS = "$MAVEN_M2_PATH/wrapper/dists"
} else {
  $MAVEN_WRAPPER_DISTS = (Get-Item $MAVEN_M2_PATH).Target[0] + "/wrapper/dists"
}

$MAVEN_HOME_PARENT = "$MAVEN_WRAPPER_DISTS/$distributionUrlNameMain"
$MAVEN_HOME_NAME = ([System.Security.Cryptography.SHA256]::Create().ComputeHash([byte[]][char[]]$distributionUrl) | ForEach-Object {$_.ToString("x2")}) -join ''
$MAVEN_HOME = "$MAVEN_HOME_PARENT/$MAVEN_HOME_NAME"

if (Test-Path -Path "$MAVEN_HOME" -PathType Container) {
  Write-Verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
  exit $?
}

if (! $distributionUrlNameMain -or ($distributionUrlName -eq $distributionUrlNameMain)) {
  Write-Error "distributionUrl is not valid, must end with *-bin.zip, but found $distributionUrl"
}

# prepare tmp dir
$TMP_DOWNLOAD_DIR_HOLDER = New-TemporaryFile
$TMP_DOWNLOAD_DIR = New-Item -Itemtype Directory -Path "$TMP_DOWNLOAD_DIR_HOLDER.dir"
$TMP_DOWNLOAD_DIR_HOLDER.Delete() | Out-Null
trap {
  if ($TMP_DOWNLOAD_DIR.Exists) {
    try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
    catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
  }
}

New-Item -Itemtype Directory -Path "$MAVEN_HOME_PARENT" -Force | Out-Null

# Download and Install Apache Maven
Write-Verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
Write-Verbose "Downloading from: $distributionUrl"
Write-Verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"

$webclient = New-Object System.Net.WebClient
if ($env:MVNW_USERNAME -and $env:MVNW_PASSWORD) {
  $webclient.Credentials = New-Object System.Net.NetworkCredential($env:MVNW_USERNAME, $env:MVNW_PASSWORD)
}
[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
$webclient.DownloadFile($distributionUrl, "$TMP_DOWNLOAD_DIR/$distributionUrlName") | Out-Null

# If specified, validate the SHA-256 sum of the Maven distribution zip file
$distributionSha256Sum = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionSha256Sum
if ($distributionSha256Sum) {
  if ($USE_MVND) {
    Write-Error "Checksum validation is not supported for maven-mvnd. `nPlease disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties."
  }
  Import-Module $PSHOME\Modules\Microsoft.PowerShell.Utility -Function Get-FileHash
  if ((Get-FileHash "$TMP_DOWNLOAD_DIR/$distributionUrlName" -Algorithm SHA256).Hash.ToLower() -ne $distributionSha256Sum) {
    Write-Error "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised. If you updated your Maven version, you need to update the specified distributionSha256Sum property."
  }
}

# unzip and move
Expand-Archive "$TMP_DOWNLOAD_DIR/$distributionUrlName" -DestinationPath "$TMP_DOWNLOAD_DIR" | Out-Null

# Find the actual extracted directory name (handles snapshots where filename != directory name)
$actualDistributionDir = ""

# First try the expected directory name (for regular distributions)
$expectedPath = Join-Path "$TMP_DOWNLOAD_DIR" "$distributionUrlNameMain"
$expectedMvnPath = Join-Path "$expectedPath" "bin/$MVN_CMD"
if ((Test-Path -Path $expectedPath -PathType Container) -and (Test-Path -Path $expectedMvnPath -PathType Leaf)) {
  $actualDistributionDir = $distributionUrlNameMain
}

# If not found, search for any directory with the Maven executable (for snapshots)
if (!$actualDistributionDir) {
  Get-ChildItem -Path "$TMP_DOWNLOAD_DIR" -Directory | ForEach-Object {
    $testPath = Join-Path $_.FullName "bin/$MVN_CMD"
    if (Test-Path -Path $testPath -PathType Leaf) {
      $actualDistributionDir = $_.Name
    }
  }
}

if (!$actualDistributionDir) {
  Write-Error "Could not find Maven distribution directory in extracted archive"
}

Write-Verbose "Found extracted Maven distribution directory: $actualDistributionDir"
Rename-Item -Path "$TMP_DOWNLOAD_DIR/$actualDistributionDir" -NewName $MAVEN_HOME_NAME | Out-Null
try {
  Move-Item -Path "$TMP_DOWNLOAD_DIR/$MAVEN_HOME_NAME" -Destination $MAVEN_HOME_PARENT | Out-Null
} catch {
  if (! (Test-Path -Path "$MAVEN_HOME" -PathType Container)) {
    Write-Error "fail to move MAVEN_HOME"
  }
} finally {
  try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
  catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
}

Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
````

## File: resource-catalog-service/pom.xml
````xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.5</version>
        <relativePath/>
    </parent>
    <groupId>com.catalog</groupId>
    <artifactId>resource-catalog-service</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>resource-catalog-service</name>
    <description>resource-catalog-service</description>
    <properties>
        <java.version>17</java.version>
        <org.mapstruct.version>1.5.5.Final</org.mapstruct.version>
        <lombok-mapstruct-binding.version>0.2.0</lombok-mapstruct-binding.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.5.0</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>${org.mapstruct.version}</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>${java.version}</source>
                    <target>${java.version}</target>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>${org.mapstruct.version}</version>
                        </path>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>${lombok.version}</version>
                        </path>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok-mapstruct-binding</artifactId>
                            <version>${lombok-mapstruct-binding.version}</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
````

## File: test-requests/developers.http
````
### 1. Creazione del primo Developer (Lorenzo)
POST http://localhost/api/v1/developers
Content-Type: application/json

{
  "nome": "Lorenzo",
  "email": "lorenzo@example.com"
}

### 2. Recupero di tutti i Developer
GET http://localhost/api/v1/developers

### 3. Test dell'Exception Handler (Email Duplicata)
# Dovrebbe restituire 400 Bad Request con il messaggio personalizzato
POST http://localhost/api/v1/developers
Content-Type: application/json

{
  "nome": "Clone",
  "email": "lorenzo@example.com"
}
````

## File: test-requests/ecosystem-integration.http
````
### 1. [CATALOG] Crea una Categoria
POST http://localhost/api/v1/categories
Content-Type: application/json

{
  "nome": "Frontend Frameworks"
}

### 2. [CATALOG] Crea una Risorsa (ID 1)
# Assicurati che l'ID della categoria sia corretto (probabilmente 1 se il DB è pulito)
POST http://localhost/api/v1/resources
Content-Type: application/json

{
  "nome": "React",
  "descrizione": "Libreria JS per interfacce",
  "url": "https://react.dev",
  "categoryId": 1
}

### 3. [DEVELOPER] Crea un Developer (ID 1)
POST http://localhost/api/v1/developers
Content-Type: application/json

{
  "nome": "Lorenzo",
  "email": "lorenzo.dev@example.com"
}

### 4. [INTEGRATION] Aggiungi la risorsa alla collezione (Feign Test)
# Questo test verifica se il developer-service riesce a chiamare il resource-service
POST http://localhost/api/v1/developers/collection
Content-Type: application/json

{
  "developerId": 1,
  "resourceId": 1
}

### 5. [ERROR TEST] Aggiunta risorsa inesistente
# Deve restituire 400 Bad Request perché Feign non troverà la risorsa 999
POST http://localhost/api/v1/developers/collection
Content-Type: application/json

{
  "developerId": 1,
  "resourceId": 999
}

### 6. [INTEGRATION] Recupero Collezione Completa (Aggregata)
GET http://localhost/api/v1/developers/1/collection

### Test: Aggiunta risorsa alla collezione
POST http://localhost/api/v1/developers/collection
Content-Type: application/json

{
  "developerId": 1,
  "resourceId": 1
}
````

## File: test-requests/gateway-test.http
````
### 1. Test Gateway - Recupero Categorie
# Il Gateway instrada questa chiamata verso resource-catalog-service
GET http://localhost/api/v1/categories

### 2. Test Gateway - Creazione Nuova Categoria
POST http://localhost/api/v1/categories
Content-Type: application/json

{
  "nome": "DevOps Tools"
}

### 3. Test Gateway - Recupero Risorse
GET http://localhost/api/v1/resources

### 4. Test Gateway - Creazione Risorsa via Gateway
# Assicurati che l'ID della categoria (categoryId) esista dopo il test 2
POST http://localhost/api/v1/resources
Content-Type: application/json

{
  "nome": "Docker",
  "descrizione": "Piattaforma per la containerizzazione",
  "url": "https://www.docker.com/",
  "categoryId": 2
}
````

## File: test-requests/phase1-refinement.http
````
POST http://localhost/api/v1/developers
Content-Type: application/json

{
  "nome": "Test Volume",
  "email": "volume@test.com"
}

###

GET http://localhost/api/v1/developers

###

POST http://localhost/api/v1/categories
Content-Type: application/json

{ "nome": "Cloud Tools" }

###
POST http://localhost/api/v1/resources
Content-Type: application/json

{
  "nome": "Terraform",
  "url": "https://terraform.io",
  "categoryId": 1
}

###

POST http://localhost/api/v1/developers/collection
Content-Type: application/json

{ "developerId": 1, "resourceId": 1 }

###

DELETE http://localhost/api/v1/developers/1/collection/1

###

GET http://localhost/api/v1/developers/1/collection

###

POST http://localhost/api/v1/developers/collection
Content-Type: application/json

{
  "developerId": 1,
  "resourceId": 999
}
````

## File: .gitignore
````
# Security: ignore environment variables
.env
````

## File: docker-compose.yml
````yaml
services:
  catalog-db:
    image: postgres:17-alpine
    container_name: catalog-db
    environment:
      POSTGRES_DB: resource_catalog_db
      POSTGRES_USER: ${DB_USERNAME}
      POSTGRES_PASSWORD: ${DB_PASSWORD}
    ports:
      - "5435:5432"
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U ${DB_USERNAME} -d resource_catalog_db"]
      interval: 5s
      timeout: 5s
      retries: 5
    volumes:
      - catalog-data:/var/lib/postgresql/data

  developer-db:
    image: postgres:17-alpine
    container_name: developer-db
    environment:
      POSTGRES_DB: developer_collection_db
      POSTGRES_USER: ${DB_USERNAME}
      POSTGRES_PASSWORD: ${DB_PASSWORD}
    ports:
      - "5436:5432"
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U ${DB_USERNAME} -d developer_collection_db"]
      interval: 5s
      timeout: 5s
      retries: 5
    volumes:
      - developer-data:/var/lib/postgresql/data

  auth-db:
    image: postgres:17-alpine
    container_name: auth-db
    environment:
      POSTGRES_DB: auth_db
      POSTGRES_USER: ${DB_USERNAME}
      POSTGRES_PASSWORD: ${DB_PASSWORD}
    ports:
      - "5437:5432"
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U ${DB_USERNAME} -d auth_db"]
      interval: 5s
      timeout: 5s
      retries: 5
    volumes:
      - auth-data:/var/lib/postgresql/data

  resource-service:
    build: ./resource-catalog-service
    container_name: resource-catalog-service
    environment:
      - SPRING_DATASOURCE_URL=jdbc:postgresql://catalog-db:5432/resource_catalog_db
      - SPRING_DATASOURCE_USERNAME=${DB_USERNAME}
      - SPRING_DATASOURCE_PASSWORD=${DB_PASSWORD}
      - SPRING_JPA_HIBERNATE_DDL_AUTO=${SPRING_JPA_HIBERNATE_DDL_AUTO}
      - SPRING_JPA_SHOW_SQL=${SPRING_JPA_SHOW_SQL}
      - API_GATEWAY_URL=${API_GATEWAY_URL}
    depends_on:
      catalog-db:
        condition: service_healthy

  developer-service:
    build: ./developer-collection-service
    container_name: developer-collection-service
    environment:
      - DEVELOPER_DATASOURCE_URL=jdbc:postgresql://developer-db:5432/developer_collection_db
      - DEVELOPER_DATASOURCE_USERNAME=${DB_USERNAME}
      - DEVELOPER_DATASOURCE_PASSWORD=${DB_PASSWORD}
      - SPRING_JPA_HIBERNATE_DDL_AUTO=${SPRING_JPA_HIBERNATE_DDL_AUTO}
      - SPRING_JPA_SHOW_SQL=${SPRING_JPA_SHOW_SQL}
      - RESOURCE_CATALOG_SERVICE_URL=${RESOURCE_CATALOG_SERVICE_URL}
      - API_GATEWAY_URL=${API_GATEWAY_URL}
    depends_on:
      developer-db:
        condition: service_healthy

  auth-service:
    build: ./auth-service
    container_name: auth-service
    environment:
      - AUTH_DATASOURCE_URL=jdbc:postgresql://auth-db:5432/auth_db
      - AUTH_DATASOURCE_USERNAME=${DB_USERNAME}
      - AUTH_DATASOURCE_PASSWORD=${DB_PASSWORD}
      - SPRING_JPA_HIBERNATE_DDL_AUTO=${SPRING_JPA_HIBERNATE_DDL_AUTO}
      - SPRING_JPA_SHOW_SQL=${SPRING_JPA_SHOW_SQL}
      - JWT_SECRET=${JWT_SECRET}
      - JWT_EXPIRATION=${JWT_EXPIRATION}
      - API_GATEWAY_URL=${API_GATEWAY_URL}
    depends_on:
      auth-db:
        condition: service_healthy

  api-gateway:
    build: ./api-gateway
    container_name: api-gateway
    ports:
      - "80:8080"
    environment:
      - JWT_SECRET=${JWT_SECRET}
      - RESOURCE_CATALOG_SERVICE_URL=${RESOURCE_CATALOG_SERVICE_URL}
      - DEVELOPER_COLLECTION_SERVICE_URL=${DEVELOPER_COLLECTION_SERVICE_URL}
      - AUTH_SERVICE_URL=${AUTH_SERVICE_URL}
    depends_on:
      - resource-service
      - developer-service
      - auth-service

volumes:
  catalog-data:
  developer-data:
  auth-data:
````

## File: README.md
````markdown
# ☁️ Dev-Inventory-Cloud

**RESTful API a Microservizi per la gestione di risorse, tool e documentazione per sviluppatori.**

Questo progetto rappresenta l'evoluzione cloud-native del catalogo [Dev-Inventory](https://github.com/Lorenzoanzivino/Dev-Inventory-API), rifattorizzato da un'architettura monolitica a un ecosistema basato su microservizi stateless, con focus su scalabilità, qualità del codice e separazione dei domini.

---

## 📑 Sommario
- [Architettura del Sistema](#-architettura-del-sistema)
- [Tech Stack & Tools](#-tech-stack--tools)
- [Design Pattern e Scelte Tecniche](#-design-pattern-e-scelte-tecniche)
- [Strategia di Testing](#-strategia-di-testing)
- [Workflow Git](#-workflow-git)
- [Setup & Esecuzione](#-setup--esecuzione)
- [API Endpoints](#-api-endpoints)

---

## 🏗️ Architettura del Sistema
Il sistema è basato su un'architettura a microservizi distribuita, orchestrata tramite Docker.

1.  **API Gateway (Spring Cloud Gateway)** - Porta: `80`
   - Punto d'accesso unico per i client con routing dinamico.
   - Implementa filtri di sicurezza per la validazione dei token JWT.
2.  **Auth Service** - Porta interna: `8082`
   - Gestisce registrazione, login e generazione di JWT (HMAC SHA-256).
   - Database: **PostgreSQL**.
3.  **Resource Catalog Service** - Porta interna: `8080`
   - Gestisce il dominio delle risorse e delle categorie (1:N).
   - Implementa pattern CQRS per l'ottimizzazione delle performance.
   - Database: **PostgreSQL**.
4.  **Developer Collection Service** - Porta interna: `8081`
   - Gestisce i profili degli sviluppatori e le loro collezioni salvate.
   - Comunica con il Catalog Service tramite **OpenFeign**.
   - Database: **PostgreSQL**.

---

## 🛠️ Tech Stack & Tools

**Backend Core**
- **Java 17** & **Spring Boot 3.2.x**
- **Spring Cloud Gateway** (API Management)
- **Spring Security** (Authentication & JWT)
- **Spring Data JPA** & **Hibernate** (Persistenza)
- **MapStruct** (Mapping DTO-Entity)
- **Lombok** (Boilerplate reduction)
- **OpenFeign** (Comunicazione Inter-service)

**Testing Frameworks**
- **JUnit 5** & **Mockito** (Unit Testing)
- **H2 Database** (In-memory testing)
- **MockMvc** (Web Layer testing)

**DevOps & Infrastruttura**
- **Docker** & **Docker Compose** (Containerizzazione)
- **PostgreSQL 17** (DBMS)
- **Maven** (Build Tool)

---

## 🧩 Design Pattern e Scelte Tecniche

### CQRS (Command Query Responsibility Segregation)
- Separazione netta tra i modelli di scrittura (**CommandService**) e i modelli di lettura (**QueryService**).
- Maggiore manutenibilità e scalabilità orizzontale dei carichi di lavoro.

### Robustezza e Manutenibilità
- **Java Records:** Utilizzo di DTO immutabili per il trasferimento dati.
- **Global Exception Handling:** Gestione centralizzata tramite `@RestControllerAdvice` con risposte standardizzate in formato JSON.
- **Logging Strutturato:** Configurazione Logback per output in formato JSON, ottimizzato per sistemi di aggregazione log in cloud.

---

## 🧪 Strategia di Testing

Il sistema adotta una piramide del test rigorosa:

-   **Unit Tests:** Verifica della logica di business nei Service utilizzando Mockito per l'isolamento completo.
-   **Repository Tests:** Integration test dello strato di persistenza con database H2 in-memory per validare query JPA e vincoli di database.
-   **Web Layer Tests:** Verifica dei controller tramite MockMvc per validare endpoint, mapping JSON e `@Valid` constraints.

---

## 🔄 Workflow Git
Viene seguito un protocollo rigoroso per garantire la stabilità del ramo principale:
1. Creazione repository GitHub.
2. Clone locale e creazione branch `develop`.
3. Sviluppo in feature branch: `feature/nome-task`.
4. Commit atomici e Push.
5. Pull Request verso `develop`.
6. Merge e cancellazione branch temporaneo.
   *Note: I commit diretti su `main` e `develop` sono proibiti.*

---

## 🚀 Setup & Esecuzione

Prerequisiti: Docker e Docker Compose installati.

1.  **Clonare la repository:**
    ```bash
    git clone [https://github.com/Lorenzoanzivino/Dev-Inventory-Cloud.git](https://github.com/Lorenzoanzivino/Dev-Inventory-Cloud.git)
    cd Dev-Inventory-Cloud
    ```
2.  **Avviare l'ecosistema:**
    ```bash
    docker compose up --build
    ```
3.  **Accesso API:**
   - Gateway: `http://localhost`
   - Swagger UI: `http://localhost/swagger-ui/index.html` (Aggregato per tutti i servizi)

---

## 📑 API Endpoints

### Auth Service
| Metodo | Endpoint | Descrizione |
| :--- | :--- | :--- |
| POST | /api/v1/auth/register | Registrazione nuovo utente |
| POST | /api/v1/auth/login | Autenticazione e rilascio JWT |

### Catalog Service
| Metodo | Endpoint | Descrizione |
| :--- | :--- | :--- |
| GET | /api/v1/categories | Recupera tutte le categorie |
| POST | /api/v1/categories | Crea una nuova categoria |
| GET | /api/v1/resources | Recupera tutte le risorse |
| POST | /api/v1/resources | Crea una risorsa (richiede CategoryId) |

### Developer Service
| Metodo | Endpoint | Descrizione |
| :--- | :--- | :--- |
| GET | /api/v1/developers | Lista sviluppatori registrati |
| GET | /api/v1/developers/{id} | Dettaglio singolo sviluppatore |

---

**Ultimo aggiornamento:** Aprile 2026
````

## File: api-gateway/pom.xml
````xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.5</version>
        <relativePath/>
    </parent>
    <groupId>com.catalog</groupId>
    <artifactId>api-gateway</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>api-gateway</name>
    <description>api-gateway</description>

    <properties>
        <java.version>17</java.version>
        <spring-cloud.version>2023.0.1</spring-cloud.version>
    </properties>

    <dependencies>
        <!-- JWT -->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-api</artifactId>
            <version>0.11.5</version>
        </dependency>

        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>0.11.5</version>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>0.11.5</version>
            <scope>runtime</scope>
        </dependency>

        <!-- Gateway & Security -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-gateway</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>

        <!-- Swagger -->
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webflux-ui</artifactId>
            <version>2.5.0</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/controller/CollectionController.java
````java
package com.catalog.developercollectionservice.controller;

import com.catalog.developercollectionservice.dto.CollectionItemResponse;
import com.catalog.developercollectionservice.dto.CollectionRequest;
import com.catalog.developercollectionservice.dto.DeveloperCollectionResponse;
import com.catalog.developercollectionservice.service.CollectionCommandService;
import com.catalog.developercollectionservice.service.CollectionQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/collections")
@RequiredArgsConstructor
public class CollectionController {

    private final CollectionCommandService commandService;
    private final CollectionQueryService queryService;

    @GetMapping
    public ResponseEntity<List<CollectionItemResponse>> getAllCollections() {
        return ResponseEntity.ok(queryService.getAllCollections());
    }

    @GetMapping("/developer/{developerId}")
    public ResponseEntity<DeveloperCollectionResponse> getCollection(@PathVariable Long developerId) {
        return ResponseEntity.ok(queryService.getDeveloperCollection(developerId));
    }

    @PostMapping
    public ResponseEntity<String> addToCollection(@Valid @RequestBody CollectionRequest request) {
        commandService.addToCollection(request);
        return new ResponseEntity<>("Risorsa aggiunta alla collezione.", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        commandService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/controller/DeveloperController.java
````java
package com.catalog.developercollectionservice.controller;

import com.catalog.developercollectionservice.dto.DeveloperRequest;
import com.catalog.developercollectionservice.dto.DeveloperResponse;
import com.catalog.developercollectionservice.service.DeveloperCommandService;
import com.catalog.developercollectionservice.service.DeveloperQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/developers")
@RequiredArgsConstructor
public class DeveloperController {

    private final DeveloperCommandService commandService;
    private final DeveloperQueryService queryService;

    @PostMapping
    public ResponseEntity<Long> createDeveloper(@Valid @RequestBody DeveloperRequest request) {
        return new ResponseEntity<>(commandService.createDeveloper(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<DeveloperResponse>> getAllDevelopers() {
        return ResponseEntity.ok(queryService.getAllDevelopers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeveloperResponse> getDeveloperById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getDeveloperById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDeveloper(@PathVariable Long id, @Valid @RequestBody DeveloperRequest request) {
        commandService.updateDeveloper(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDeveloper(@PathVariable Long id) {
        commandService.deleteDeveloper(id);
        return ResponseEntity.noContent().build();
    }
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/dto/CollectionItemResponse.java
````java
package com.catalog.developercollectionservice.dto;

/**
 * DTO per la risposta di un singolo elemento della collezione.
 * I nomi dei campi devono corrispondere a quelli usati nel frontend (dataIndex).
 */
public record CollectionItemResponse(
        Long id,
        Long resourceId,
        String resourceName, // Nome della risorsa recuperato dal catalogo
        String developerName // Nome dello sviluppatore proprietario
) {}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/service/CollectionCommandService.java
````java
package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.client.ResourceClient;
import com.catalog.developercollectionservice.dto.CollectionRequest;
import com.catalog.developercollectionservice.entity.CollectionItem;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.repository.CollectionItemRepository;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CollectionCommandService {

    private final CollectionItemRepository collectionRepository;
    private final DeveloperRepository developerRepository;
    private final ResourceClient resourceClient;

    public void addToCollection(CollectionRequest request) {
        Developer developer = developerRepository.findById(request.developerId())
                .orElseThrow(() -> new RuntimeException("Sviluppatore non trovato."));

        if (collectionRepository.existsByDeveloperIdAndResourceId(request.developerId(), request.resourceId())) {
            throw new RuntimeException("Risorsa già presente nella collezione.");
        }

        resourceClient.getResourceById(request.resourceId());

        CollectionItem item = CollectionItem.builder()
                .developer(developer)
                .resourceId(request.resourceId())
                .build();

        collectionRepository.save(item);
    }

    public void deleteById(Long id) {
        if (!collectionRepository.existsById(id)) {
            throw new RuntimeException("Item della collezione non trovato.");
        }
        collectionRepository.deleteById(id);
    }

    public void removeFromCollection(Long developerId, Long resourceId) {
        collectionRepository.deleteByDeveloperIdAndResourceId(developerId, resourceId);
    }
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/service/CollectionQueryService.java
````java
package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.client.ResourceClient;
import com.catalog.developercollectionservice.dto.CollectionItemResponse;
import com.catalog.developercollectionservice.dto.DeveloperCollectionResponse;
import com.catalog.developercollectionservice.dto.ResourceCatalogResponse;
import com.catalog.developercollectionservice.entity.CollectionItem;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.repository.CollectionItemRepository;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CollectionQueryService {

    private final CollectionItemRepository collectionRepository;
    private final DeveloperRepository developerRepository;
    private final ResourceClient resourceClient;

    /**
     * Recupera tutte le assegnazioni del sistema.
     * Mappa correttamente i nomi per la tabella del frontend.
     */
    public List<CollectionItemResponse> getAllCollections() {
        return collectionRepository.findAll().stream().map(item -> {
            String devName = (item.getDeveloper() != null) ? item.getDeveloper().getNome() : "Sconosciuto";
            try {
                ResourceCatalogResponse resourceData = resourceClient.getResourceById(item.getResourceId());
                return new CollectionItemResponse(
                        item.getId(),
                        item.getResourceId(),
                        resourceData.nome(), // Mappa su resourceName
                        devName              // Mappa su developerName
                );
            } catch (Exception e) {
                // Fallback in caso di microservizio catalogo offline
                return new CollectionItemResponse(item.getId(), item.getResourceId(), "N/D (Errore Catalogo)", devName);
            }
        }).collect(Collectors.toList());
    }

    public DeveloperCollectionResponse getDeveloperCollection(Long developerId) {
        Developer developer = developerRepository.findById(developerId)
                .orElseThrow(() -> new RuntimeException("Sviluppatore non trovato."));

        List<CollectionItem> items = collectionRepository.findByDeveloperId(developerId);

        List<CollectionItemResponse> itemResponses = items.stream().map(item -> {
            try {
                ResourceCatalogResponse resourceData = resourceClient.getResourceById(item.getResourceId());
                return new CollectionItemResponse(
                        item.getId(),
                        item.getResourceId(),
                        resourceData.nome(),
                        developer.getNome() // Coerenza: passiamo sempre il nome dev
                );
            } catch (Exception e) {
                return new CollectionItemResponse(item.getId(), item.getResourceId(), "Risorsa non disponibile", developer.getNome());
            }
        }).collect(Collectors.toList());

        return new DeveloperCollectionResponse(developer.getId(), developer.getNome(), itemResponses);
    }
}
````

## File: developer-collection-service/src/main/java/com/catalog/developercollectionservice/service/DeveloperCommandService.java
````java
package com.catalog.developercollectionservice.service;

import com.catalog.developercollectionservice.dto.DeveloperRequest;
import com.catalog.developercollectionservice.entity.Developer;
import com.catalog.developercollectionservice.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class DeveloperCommandService {

    private final DeveloperRepository developerRepository;

    public Long createDeveloper(DeveloperRequest request) {
        Developer developer = new Developer();
        developer.setNome(request.nome());
        developer.setEmail(request.email());
        return developerRepository.save(developer).getId();
    }

    public void updateDeveloper(Long id, DeveloperRequest request) {
        Developer developer = developerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Developer not found with ID: " + id));
        developer.setNome(request.nome());
        developer.setEmail(request.email());
        developerRepository.save(developer);
    }

    public void deleteDeveloper(Long id) {
        Developer developer = developerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Developer not found with ID: " + id));
        developerRepository.delete(developer);
    }
}
````

## File: frontend-service/src/api/axiosInstance.ts
````typescript
import axios from "axios";

export const axiosInstance = axios.create({
    headers: {
        "Content-Type": "application/json",
        "Accept": "application/json"
    }
});

axiosInstance.interceptors.request.use((config) => {
    const token = localStorage.getItem("token");
    if (token && config.headers) {
        config.headers["Authorization"] = `Bearer ${token}`;
    }
    return config;
});
````

## File: frontend-service/src/components/ui/Primitives.tsx
````typescript
import React from 'react';
import {
    Button as AntdButton,
    Card as AntdCard,
    Input as AntdInput,
    Typography,
    ButtonProps as AntdButtonProps,
    CardProps as AntdCardProps,
    InputProps as AntdInputProps
} from 'antd';

const { Text } = Typography;

interface ButtonProps extends Omit<AntdButtonProps, 'variant'> {
    variant?: 'primary' | 'secondary' | 'danger';
}

export const Button: React.FC<ButtonProps> = ({ children, variant = 'primary', style, ...props }) => {
    const customStyle: React.CSSProperties = {
        fontWeight: 'bold',
        letterSpacing: '0.05em',
        boxShadow: variant === 'primary' ? '8px 8px 20px rgba(162,199,229,0.4), -8px -8px 20px rgba(255,255,255,0.9)' :
            variant === 'secondary' ? '5px 5px 15px #e3e3e3, -5px -5px 15px #ffffff' :
                '4px 4px 10px #f5dada, -4px -4px 10px #ffffff',
        border: 'none',
        ...style
    };

    const typeMap = {
        primary: 'primary',
        secondary: 'default',
        danger: 'primary'
    } as const;

    return (
        <AntdButton
            type={typeMap[variant]}
            danger={variant === 'danger'}
            style={customStyle}
            size="large"
            shape="round"
            {...props}
        >
            {children}
        </AntdButton>
    );
};

interface CardProps extends AntdCardProps {}

export const Card: React.FC<CardProps> = ({ children, style, ...props }) => (
    <AntdCard
        variant="borderless"
        style={{
            backgroundColor: 'rgba(255, 255, 255, 0.6)',
            backdropFilter: 'blur(24px)',
            WebkitBackdropFilter: 'blur(24px)',
            borderRadius: '48px',
            border: '1px solid rgba(255, 255, 255, 0.8)',
            boxShadow: '0 20px 50px rgba(0,0,0,0.04)',
            ...style
        }}
        {...props}
    >
        {children}
    </AntdCard>
);

interface InputProps extends AntdInputProps {
    label?: string;
}

export const Input: React.FC<InputProps> = ({ label, style, ...props }) => (
    <div style={{ display: 'flex', flexDirection: 'column', gap: '12px', width: '100%' }}>
        {label && (
            <Text style={{
                fontSize: '11px',
                fontWeight: 900,
                color: '#A2C7E5',
                marginLeft: '16px',
                textTransform: 'uppercase',
                letterSpacing: '0.2em'
            }}>
                {label}
            </Text>
        )}
        <AntdInput
            style={{
                backgroundColor: '#F8FAFC',
                borderRadius: '24px',
                padding: '16px 24px',
                fontSize: '14px',
                color: '#52525b',
                boxShadow: 'inset 4px 4px 10px rgba(0,0,0,0.03)',
                border: 'none',
                ...style
            }}
            {...props}
        />
    </div>
);

export const Badge: React.FC<{ children: React.ReactNode }> = ({ children }) => (
    <span style={{
        padding: '6px 16px',
        borderRadius: '9999px',
        backgroundColor: 'rgba(255, 255, 255, 0.5)',
        color: '#8ba7c4',
        fontSize: '10px',
        fontWeight: 900,
        textTransform: 'uppercase',
        letterSpacing: '0.15em',
        border: '1px solid white',
        boxShadow: '0 1px 2px rgba(0,0,0,0.05)',
        backdropFilter: 'blur(12px)',
        WebkitBackdropFilter: 'blur(12px)'
    }}>
        {children}
    </span>
);
````

## File: frontend-service/src/interfaces/types.ts
````typescript
export interface ICategory {
    id: number;
    nome: string;
}

export interface IResource {
    id: number;
    nome: string;
    descrizione: string;
    url: string;
    category: ICategory;
    dataInserimento: string;
}

export interface IDeveloper {
    id: number;
    nome: string;
    email: string;
}

export interface ICollection {
    id: number;
    resourceId: number;
    resourceName: string;
    developerName: string;
}
````

## File: frontend-service/.gitignore
````
# Logs

logs
_.log
npm-debug.log_
yarn-debug.log*
yarn-error.log*
pnpm-debug.log*
lerna-debug.log*

node_modules
dist
dist-ssr
*.local

# Environment variables
.env
.env.local

# Editor directories and files

.vscode/_
!.vscode/extensions.json
.idea
.DS_Store
_.suo
_.ntvs_
_.njsproj
_.sln
\*.sw?
````

## File: frontend-service/eslint.config.js
````javascript
import js from "@eslint/js";
import reactHooks from "eslint-plugin-react-hooks";
import reactRefresh from "eslint-plugin-react-refresh";
import globals from "globals";
import tseslint from "typescript-eslint";

export default tseslint.config(
  { ignores: ["dist"] },
  {
    extends: [js.configs.recommended, ...tseslint.configs.recommended],
    files: ["**/*.{ts,tsx}"],
    languageOptions: {
      ecmaVersion: 2020,
      globals: globals.browser,
    },
    plugins: {
      "react-hooks": reactHooks,
      "react-refresh": reactRefresh,
    },
    rules: {
      ...reactHooks.configs.recommended.rules,
      "react-refresh/only-export-components": [
        "warn",
        { allowConstantExport: true },
      ],
    },
  }
);
````

## File: frontend-service/index.html
````html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <link rel="icon" href="/favicon.ico" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="theme-color" content="#000000" />
    <meta
      name="description"
      content="refine | Build your React-based CRUD applications, without constraints."
    />
    <meta
      data-rh="true"
      property="og:image"
      content="https://refine.dev/img/refine_social.png"
    />
    <meta
      data-rh="true"
      name="twitter:image"
      content="https://refine.dev/img/refine_social.png"
    />
    <title>
      Refine - Build your React-based CRUD applications, without constraints.
    </title>
  </head>
  <body>
    <noscript>You need to enable JavaScript to run this app.</noscript>
    <div id="root"></div>
    <script type="module" src="/src/index.tsx"></script>
    <!--
      This HTML file is a template.
      If you open it directly in the browser, you will see an empty page.

      You can add webfonts, meta tags, or analytics to this file.
      The build step will place the bundled scripts into the <body> tag.

      To begin the development, run `npm dev` or `yarn start`.
      To create a production bundle, use `npm run build` or `yarn build`.
    -->
  </body>
</html>
````

## File: frontend-service/package.json
````json
{
  "name": "frontend-service",
  "version": "0.1.0",
  "private": true,
  "type": "module",
  "dependencies": {
    "@refinedev/antd": "^5.38.0",
    "@refinedev/core": "^4.46.0",
    "@refinedev/react-router-v6": "^4.5.4",
    "@refinedev/simple-rest": "^5.0.0",
    "antd": "^5.14.0",
    "axios": "^1.6.7",
    "react": "^18.2.0",
    "react-dom": "^18.2.0",
    "react-router-dom": "^6.22.1"
  },
  "devDependencies": {
    "@eslint/js": "^9.25.0",
    "@refinedev/cli": "^2.16.52",
    "@types/node": "^20",
    "@types/react": "^19.1.0",
    "@types/react-dom": "^19.1.0",
    "@typescript-eslint/eslint-plugin": "^5.57.1",
    "@typescript-eslint/parser": "^5.57.1",
    "@vitejs/plugin-react": "^4.4.1",
    "eslint": "^9.25.0",
    "eslint-plugin-react-hooks": "^5.2.0",
    "eslint-plugin-react-refresh": "^0.4.19",
    "globals": "^16.0.0",
    "typescript": "^5.8.3",
    "typescript-eslint": "^8.30.1",
    "vite": "^6.3.5"
  },
  "scripts": {
    "dev": "refine dev",
    "build": "tsc && refine build",
    "start": "refine start",
    "refine": "refine"
  },
  "browserslist": {
    "production": [
      ">0.2%",
      "not dead",
      "not op_mini all"
    ],
    "development": [
      "last 1 chrome version",
      "last 1 firefox version",
      "last 1 safari version"
    ]
  },
  "refine": {
    "projectId": "4Qoc67-RadAFe-VcCDqO"
  }
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/controller/CategoryController.java
````java
package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.service.CategoryCommandService;
import com.catalog.resource_catalog_service.service.CategoryQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryCommandService commandService;
    private final CategoryQueryService queryService;

    @PostMapping
    public ResponseEntity<Long> createCategory(@Valid @RequestBody CategoryRequest request) {
        return new ResponseEntity<>(commandService.createCategory(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> getAllCategories() {
        return ResponseEntity.ok(queryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponse> getCategoryById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getCategoryById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCategory(@PathVariable Long id, @Valid @RequestBody CategoryRequest request) {
        commandService.updateCategory(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        commandService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/controller/ResourceController.java
````java
package com.catalog.resource_catalog_service.controller;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.dto.ResourceResponse;
import com.catalog.resource_catalog_service.service.ResourceCommandService;
import com.catalog.resource_catalog_service.service.ResourceQueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resources")
@RequiredArgsConstructor
public class ResourceController {

    private final ResourceCommandService commandService;
    private final ResourceQueryService queryService;

    @PostMapping
    public ResponseEntity<Long> createResource(@Valid @RequestBody ResourceRequest request) {
        return new ResponseEntity<>(commandService.createResource(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ResourceResponse>> getAllResources() {
        return ResponseEntity.ok(queryService.getAllResources());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResourceResponse> getResourceById(@PathVariable Long id) {
        return ResponseEntity.ok(queryService.getResourceById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateResource(@PathVariable Long id, @Valid @RequestBody ResourceRequest request) {
        commandService.updateResource(id, request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResource(@PathVariable Long id) {
        commandService.deleteResource(id);
        return ResponseEntity.noContent().build();
    }
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/service/CategoryCommandService.java
````java
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryCommandService {

    private final CategoryRepository categoryRepository;

    public Long createCategory(CategoryRequest request) {
        Category category = new Category();
        category.setNome(request.nome());
        return categoryRepository.save(category).getId();
    }

    public void updateCategory(Long id, CategoryRequest request) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
        category.setNome(request.nome());
        categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
        categoryRepository.delete(category);
    }
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/service/CategoryQueryService.java
````java
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.CategoryResponse;
import com.catalog.resource_catalog_service.mapper.CategoryMapper;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CategoryQueryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public List<CategoryResponse> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(categoryMapper::toResponse)
                .collect(Collectors.toList());
    }

    public CategoryResponse getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .map(categoryMapper::toResponse)
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
    }
}
````

## File: resource-catalog-service/src/main/java/com/catalog/resource_catalog_service/service/ResourceCommandService.java
````java
package com.catalog.resource_catalog_service.service;

import com.catalog.resource_catalog_service.dto.ResourceRequest;
import com.catalog.resource_catalog_service.entity.Category;
import com.catalog.resource_catalog_service.entity.Resource;
import com.catalog.resource_catalog_service.repository.CategoryRepository;
import com.catalog.resource_catalog_service.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ResourceCommandService {

    private final ResourceRepository resourceRepository;
    private final CategoryRepository categoryRepository;

    public Long createResource(ResourceRequest request) {
        Category category = categoryRepository.findById(request.categoryId())
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + request.categoryId()));

        Resource resource = new Resource();
        resource.setNome(request.nome());
        resource.setDescrizione(request.descrizione());
        resource.setUrl(request.url());
        resource.setCategory(category);

        return resourceRepository.save(resource).getId();
    }

    public void updateResource(Long id, ResourceRequest request) {
        Resource resource = resourceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resource not found with ID: " + id));

        Category category = categoryRepository.findById(request.categoryId())
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + request.categoryId()));

        resource.setNome(request.nome());
        resource.setDescrizione(request.descrizione());
        resource.setUrl(request.url());
        resource.setCategory(category);

        resourceRepository.save(resource);
    }

    public void deleteResource(Long id) {
        Resource resource = resourceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resource not found with ID: " + id));

        resourceRepository.delete(resource);
    }
}
````

## File: api-gateway/src/main/java/com/catalog/apigateway/filter/AuthenticationFilter.java
````java
package com.catalog.apigateway.filter;

import com.catalog.apigateway.util.JwtUtil;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

    private final JwtUtil jwtUtil;

    public AuthenticationFilter(JwtUtil jwtUtil) {
        super(Config.class);
        this.jwtUtil = jwtUtil;
    }

    public static class Config { }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            // STOP ALLE OPTIONS: blocca la richiesta qui e rispondi con 200 OK
            if (exchange.getRequest().getMethod().equals(HttpMethod.OPTIONS)) {
                exchange.getResponse().setStatusCode(HttpStatus.OK);
                return exchange.getResponse().setComplete(); // NON passa al microservizio
            }

            // 1. Controlla se l'header esiste
            if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
                return exchange.getResponse().setComplete();
            }

            // 2. Estrai il token pulito
            String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
            if (authHeader != null && authHeader.startsWith("Bearer ")) {
                authHeader = authHeader.substring(7);
            } else {
                exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
                return exchange.getResponse().setComplete();
            }

            // 3. Valida il token
            try {
                jwtUtil.validateToken(authHeader);
            } catch (Exception e) {
                exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
                return exchange.getResponse().setComplete();
            }

            // Se è tutto ok, passa la richiesta al microservizio
            return chain.filter(exchange);
        };
    }
}
````

## File: frontend-service/src/authProvider.ts
````typescript
import { AuthProvider } from "@refinedev/core";
import { axiosInstance } from "./api/axiosInstance";

const API_URL = import.meta.env.VITE_API_URL;

// Funzione helper per decodificare il nome dal JWT senza librerie esterne
const decodeToken = (token: string) => {
    try {
        const base64Url = token.split('.')[1];
        const base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
        const jsonPayload = decodeURIComponent(window.atob(base64).split('').map(function(c) {
            return '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2);
        }).join(''));

        return JSON.parse(jsonPayload);
    } catch (e) {
        return null;
    }
};

export const authProvider: AuthProvider = {
    login: async ({ email, password }) => {
        try {
            const { data } = await axiosInstance.post(`${API_URL}/auth/login`, {
                email,
                password,
            });

            const token = data?.token || data?.accessToken || data;

            if (token && typeof token === "string") {
                localStorage.setItem("token", token);
                return {
                    success: true,
                    redirectTo: "/",
                };
            }

            throw new Error("Formato token non riconosciuto");
        } catch (error: any) {
            return {
                success: false,
                error: {
                    name: "Errore di Autenticazione",
                    message: error.response?.data?.message || "Credenziali non valide.",
                },
            };
        }
    },
    register: async ({ nome, email, password }) => {
        try {
            await axiosInstance.post(`${API_URL}/auth/register`, {
                nome,
                email,
                password,
            });

            return {
                success: true,
                redirectTo: "/login",
            };
        } catch (error: any) {
            return {
                success: false,
                error: {
                    name: "Errore Registrazione",
                    message: error.response?.data?.message || "Impossibile creare l'account.",
                },
            };
        }
    },
    logout: async () => {
        localStorage.removeItem("token");
        return {
            success: true,
            redirectTo: "/login",
        };
    },
    check: async () => {
        const token = localStorage.getItem("token");
        if (token) return { authenticated: true };

        return {
            authenticated: false,
            logout: true,
            redirectTo: "/login",
        };
    },
    getPermissions: async () => null,
    getIdentity: async () => {
        const token = localStorage.getItem("token");
        if (token) {
            const decoded = decodeToken(token);
            return {
                id: 1,
                name: decoded?.sub || decoded?.nome || "Utente", // Legge dal token
                avatar: "https://i.pravatar.cc/300",
            };
        }
        return null;
    },
    onError: async (error) => {
        const status = error?.status || error?.response?.status;
        if (status === 401 || status === 403) {
            localStorage.removeItem("token");
            return {
                logout: true,
                redirectTo: "/login",
            };
        }
        return {};
    },
};
````

## File: api-gateway/src/main/resources/application.yml
````yaml
server:
  port: 8080

spring:
  application:
    name: api-gateway
  cloud:
    gateway:
      routes:
        # --- RESOURCE SERVICE ---
        - id: resource-catalog-api
          uri: ${RESOURCE_CATALOG_SERVICE_URL}
          predicates:
            - Path=/api/v1/resources/**, /api/v1/categories/**
            - Method=GET,POST,PUT,DELETE,PATCH
          filters:
            - AuthenticationFilter

        - id: resource-catalog-docs
          uri: ${RESOURCE_CATALOG_SERVICE_URL}
          predicates:
            - Path=/v3/api-docs/resources/**
          filters:
            - RewritePath=/v3/api-docs/resources(?<segment>.*), /v3/api-docs$\{segment}

        # --- DEVELOPER SERVICE ---
        - id: developer-collection-api
          uri: ${DEVELOPER_COLLECTION_SERVICE_URL}
          predicates:
            - Path=/api/v1/developers/**, /api/v1/collections/**
            - Method=GET,POST,PUT,DELETE,PATCH
          filters:
            - AuthenticationFilter

        - id: developer-collection-docs
          uri: ${DEVELOPER_COLLECTION_SERVICE_URL}
          predicates:
            - Path=/v3/api-docs/developers/**
          filters:
            - RewritePath=/v3/api-docs/developers(?<segment>.*), /v3/api-docs$\{segment}

        # --- AUTH SERVICE ---
        - id: auth-service
          uri: ${AUTH_SERVICE_URL}
          predicates:
            - Path=/api/v1/auth/**, /v3/api-docs/auth/**
          filters:
            - RewritePath=/v3/api-docs/auth(?<segment>.*), /v3/api-docs$\{segment}

springdoc:
  swagger-ui:
    path: /swagger-ui/index.html
    urls:
      - name: 1. Resource Catalog
        url: /v3/api-docs/resources
      - name: 2. Developer Collection
        url: /v3/api-docs/developers
      - name: 3. Auth Service
        url: /v3/api-docs/auth

jwt:
  secret: ${JWT_SECRET}
````

## File: frontend-service/src/App.tsx
````typescript
import { useContext } from "react";
import { Refine, Authenticated } from "@refinedev/core";
import {
    ErrorComponent,
    useNotificationProvider,
    ThemedLayoutV2
} from "@refinedev/antd";
import routerBindings, {
    NavigateToResource,
    UnsavedChangesNotifier,
    CatchAllNavigate
} from "@refinedev/react-router-v6";
import dataProvider from "@refinedev/simple-rest";
import { BrowserRouter, Routes, Route, Outlet } from "react-router-dom";
import { App as AntdApp, ConfigProvider } from "antd";
import "@refinedev/antd/dist/reset.css";

import { authProvider } from "./authProvider";
import { axiosInstance } from "./api/axiosInstance";
import { ColorModeContextProvider, ColorModeContext } from "./contexts/color-mode";
import { lightTheme, darkTheme } from "./styles/theme";
import { APP_TEXTS } from "./constants/texts";

import { Login } from "./pages/Login";
import { Register } from "./pages/Register";
import { ProfilePage } from "./pages/Profile";
import { CustomSider } from "./components/CustomSider";
import { Header } from "./components/header";

import { ResourceList, ResourceCreate, ResourceEdit } from "./pages/resources";
import { CategoryList, CategoryCreate, CategoryEdit } from "./pages/categories";
import { DeveloperList, DeveloperCreate, DeveloperEdit } from "./pages/developers";
import { CollectionList, CollectionCreate, CollectionEdit } from "./pages/collections";

const API_URL = import.meta.env.VITE_API_URL;

const AppThemed = () => {
    const { mode } = useContext(ColorModeContext);

    return (
        <ConfigProvider theme={mode === "light" ? lightTheme : darkTheme}>
            <AntdApp>
                <Refine
                    dataProvider={dataProvider(API_URL, axiosInstance)}
                    authProvider={authProvider}
                    notificationProvider={useNotificationProvider}
                    routerProvider={routerBindings}
                    resources={[
                        {
                            name: "resources",
                            list: "/resources",
                            create: "/resources/create",
                            edit: "/resources/edit/:id",
                            meta: { canDelete: true, label: APP_TEXTS.navigation.resources },
                        },
                        {
                            name: "categories",
                            list: "/categories",
                            create: "/categories/create",
                            edit: "/categories/edit/:id",
                            meta: { canDelete: true, label: APP_TEXTS.navigation.categories },
                        },
                        {
                            name: "developers",
                            list: "/developers",
                            create: "/developers/create",
                            edit: "/developers/edit/:id",
                            meta: { canDelete: true, label: APP_TEXTS.navigation.developers },
                        },
                        {
                            name: "collections",
                            list: "/collections",
                            create: "/collections/create",
                            edit: "/collections/edit/:id",
                            meta: { canDelete: true, label: APP_TEXTS.navigation.collections },
                        }
                    ]}
                    options={{
                        syncWithLocation: true,
                        warnWhenUnsavedChanges: true,
                    }}
                >
                    <Routes>
                        <Route
                            element={
                                <Authenticated
                                    key="authenticated-routes"
                                    fallback={<CatchAllNavigate to="/login" />}
                                >
                                    <ThemedLayoutV2
                                        Header={Header}
                                        Sider={CustomSider}
                                    >
                                        <Outlet />
                                    </ThemedLayoutV2>
                                </Authenticated>
                            }
                        >
                            <Route index element={<NavigateToResource resource="resources" />} />
                            <Route path="/resources/*">
                                <Route index element={<ResourceList />} />
                                <Route path="create" element={<ResourceCreate />} />
                                <Route path="edit/:id" element={<ResourceEdit />} />
                            </Route>
                            <Route path="/categories/*">
                                <Route index element={<CategoryList />} />
                                <Route path="create" element={<CategoryCreate />} />
                                <Route path="edit/:id" element={<CategoryEdit />} />
                            </Route>
                            <Route path="/developers/*">
                                <Route index element={<DeveloperList />} />
                                <Route path="create" element={<DeveloperCreate />} />
                                <Route path="edit/:id" element={<DeveloperEdit />} />
                            </Route>
                            <Route path="/collections/*">
                                <Route index element={<CollectionList />} />
                                <Route path="create" element={<CollectionCreate />} />
                                <Route path="edit/:id" element={<CollectionEdit />} />
                            </Route>
                            <Route path="/profile" element={<ProfilePage />} />
                            <Route path="*" element={<ErrorComponent />} />
                        </Route>

                        <Route
                            element={
                                <Authenticated key="auth-pages" fallback={<Outlet />}>
                                    <NavigateToResource />
                                </Authenticated>
                            }
                        >
                            <Route path="/login" element={<Login />} />
                            <Route path="/register" element={<Register />} />
                        </Route>
                    </Routes>
                    <UnsavedChangesNotifier />
                </Refine>
            </AntdApp>
        </ConfigProvider>
    );
};

const App = () => (
    <BrowserRouter>
        <ColorModeContextProvider>
            <AppThemed />
        </ColorModeContextProvider>
    </BrowserRouter>
);

export default App;
````
