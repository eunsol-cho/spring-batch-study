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

## 스프링배치 아키텍처  
- Application : 개발자 소스    
- Batch Core
  - Job실행, 모니터링, 관리 API 
  - JobLauncher, Job, Step, Flow...  
- Batch Infrastructure
  - Application, Core 모두 Infrastructure위에서 빌드 
  - Job의 실행 흐름+처리 위한 틀
  - Reader, Processor, Writer, Skip, Retry...

## @EnableBatchProcessing
스프링 배치가 작동하기 위한 어노테이션 
- 빈으로 등록된 모든 Job을 검색 + 초기화
- **JobLauncher**ApplicationRunner 빈 생성 → Job 수행

> @SpringBootApplication    
> = @ComponentScan + @EnableAutoConfiguration ...   
> 스프링 배치 실행에 필수요소인 **데이터 소스** 및 스프링 부트 기반의 구성을 자동으로 만들어 준다.
