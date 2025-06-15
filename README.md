# 20250614-15-Spring-Cloud-Stream

2025/06/14~06/15 Spring Cloud Stream 개발하기


## producer-app 
POST http://localhost:8080/send?message=메시지 요청을 받으면 example-topic 토픽에 메시지를 발행

## consumer-app
example-topic 토픽에 메시지를 가져와 receive 빈으로 전달 

## time-topic-producer, time-topic-consumer
2초 간격으로 현재 시간을 메시지로 생산하고, 해당 메시지를 가져와서 출력

## order-service
POST http://localhost:8080/orders?productName=제품명 요청을 받으면 { orderId: UUID, productName: 제품명 } 형식의 데이터를 반환하고, 해당 정보를 데이터베이스(테이블)에 저장하고, 토픽에 메시지를 저장

## inventory-service
order-service에서 생성한 메시지를 가져와서 출력


