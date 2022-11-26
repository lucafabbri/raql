<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit7e78f82922cdee30f19c895dfe49a71e
{
    public static $prefixLengthsPsr4 = array (
        'A' => 
        array (
            'Antlr\\Antlr4\\Runtime\\' => 21,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'Antlr\\Antlr4\\Runtime\\' => 
        array (
            0 => __DIR__ . '/..' . '/antlr/antlr4-php-runtime/src',
        ),
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit7e78f82922cdee30f19c895dfe49a71e::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit7e78f82922cdee30f19c895dfe49a71e::$prefixDirsPsr4;

        }, null, ClassLoader::class);
    }
}