FROM php:7.4.33-apache-bullseye

RUN apt-get update && apt-get install -y unzip && \
    php -r "copy('https://getcomposer.org/installer', 'composer-setup.php');" && \
    php composer-setup.php --install-dir=/usr/local/bin --filename=composer && \
    php -r "unlink('composer-setup.php');"


RUN docker-php-ext-install bcmath
RUN docker-php-ext-install sockets


WORKDIR /var/www/html
COPY composer.json /var/www/html/composer.json
COPY . /var/www/html/


RUN composer install




