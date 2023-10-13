<?php return array(
    'root' => array(
        'name' => 'microservices/email',
        'pretty_version' => '1.0.0+no-version-set',
        'version' => '1.0.0.0',
        'reference' => NULL,
        'type' => 'project',
        'install_path' => __DIR__ . '/../../',
        'aliases' => array(),
        'dev' => true,
    ),
    'versions' => array(
        'microservices/email' => array(
            'pretty_version' => '1.0.0+no-version-set',
            'version' => '1.0.0.0',
            'reference' => NULL,
            'type' => 'project',
            'install_path' => __DIR__ . '/../../',
            'aliases' => array(),
            'dev_requirement' => false,
        ),
        'php-amqplib/php-amqplib' => array(
            'pretty_version' => 'v2.8.1',
            'version' => '2.8.1.0',
            'reference' => '84449ffd3f5a7466bbee3946facb3746ff11f075',
            'type' => 'library',
            'install_path' => __DIR__ . '/../php-amqplib/php-amqplib',
            'aliases' => array(),
            'dev_requirement' => false,
        ),
        'prodigyview/prodigyview' => array(
            'pretty_version' => '0.9.99',
            'version' => '0.9.99.0',
            'reference' => '053cd02f168f3732d694de62ed763ff5b01be314',
            'type' => 'library',
            'install_path' => __DIR__ . '/../prodigyview/prodigyview',
            'aliases' => array(),
            'dev_requirement' => false,
        ),
        'videlalvaro/php-amqplib' => array(
            'dev_requirement' => false,
            'replaced' => array(
                0 => 'v2.8.1',
            ),
        ),
    ),
);
