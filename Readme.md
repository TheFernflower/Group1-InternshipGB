# About project
This is a intern project of web-crawler. It can:
- download a web-page
- count number of keywords
- write the result to the database (Postgre)
Crawler supports multi-threaded and multi-instance work. Threads are synchronized via semaphores. Instances are synchronized via database. Locks in the database are freed on instance shutdown via shutdown hook.
The original project is here https://github.com/Niove1/Group1-InternshipGB
Class SiteStructureFetcher was written by https://github.com/alexprigor

# Build
```
mvn build
```
# Run
```
java -jar crawler.jar
```
