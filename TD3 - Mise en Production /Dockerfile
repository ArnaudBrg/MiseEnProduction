#docker build -t monimagepingouin .
#docker run -p 8080:80 monimagepingouin

FROM nginx

RUN rm /usr/share/nginx/html/index.html

COPY index.html /usr/share/nginx/html/
COPY Pingouin.jpeg /usr/share/nginx/html/

EXPOSE 80



