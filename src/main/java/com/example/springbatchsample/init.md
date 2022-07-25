# 초기설정 관련 내용

## 메타데이터 생성 방법

1. 수동생성 - 쿼리 실행 (DB스키마별 제공) *권장
> https://github.com/spring-projects/spring-batch/blob/main/spring-batch-core/src/main/resources/org/springframework/batch/core/schema-mysql.sql

2. 자동생성
```
batch:
    jdbc:
        initialize-schema: always
```
- always : 항상실행. RDBMS설정 있는경우 내장DB보다 우선
- embedded : 내장DB일때만 실행 (default)
- never : 실행안함. 내장DB의 경우 스크립트 생성되지 않아 오류
