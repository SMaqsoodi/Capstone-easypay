FROM alpine
#COPY application-code .
RUN apk add php
ENTRYPOINT ["php"]
CMD ["-f","index.php","-S","0.0.0.0:8080"]
EXPOSE 8080

#FROM ubuntu
#MAINTAINER SAEED MAQSOODI
#RUN apt-get update \
#    && apt-get install -y nginx \
#    && apt-get clean \
#    && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/* \
#    && echo "daemon off;" >> /etc/nginx/nginx.conf
#ENTRYPOINT ["nginx"]
#ADD default /etc/nginx/sites-available/default
#ADD application-code .
#EXPOSE 80
#CMD ["nginx"]
#VOLUME 
#	/var/cache/nginx
#	/var/run
