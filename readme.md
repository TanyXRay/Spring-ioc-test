# Тестовый проект на Spring Framework 
##### В данном проекте показана практическая реализация одного из основных абстрактных принципов вышеуказанного фрейворка - IoC (Invertional of Control), в котором происходит ручная настройка создания Beans (объектов java) в конфигурационном файле applicationContext.xml.
##### При создании проекта использовался архетип-шаблон для мавен - maven-archetype-webapp
##### В файле pom.xml в зависимости для работы со Spring были добавлены библиотеки spring-core, spring-beans, spring-context.

*В ветке test-di-file показано внедрение зависимости с помощью setter, дополнительно произведено внедрение зависимости из файла musicPlayer.properties для полей класса MusicPlayer, а в конфигурационном файле xml указан тег <context:property-placeholder location с указанием classpath для properties*