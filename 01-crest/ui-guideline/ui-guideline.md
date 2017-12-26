# Guidline for UI Development

## 1. Development Policy
### 1.1. Target Developer

Targets of this document are developers who want to develop modern web applications with HTML5/JavaScript/CSS3.  
It is necessary that developers have a basic knowledge of these technologies.  
In addition, it is hoped that developers have a basic knowledge of Jade/TypeScript/AngularJS/Sass.  

In this document, we discuss about basic features of technologies and somethings to note when you develop applications.  
When you want more information, we would like you to access urls in **Z. Lins**. 

## 2. Technology Stack
### 2.1. Jade
[Jade][jade-link] is a template engine translating `.jade` template files to `HTML` files.  
At first, a sample template is as below.  

**[ Jade Template Sample ]**
```jade
doctype html
html(lang="en")
  head
    title= pageTitle
    script(type='text/javascript').
      if (foo) {
         bar(1 + 5)
      }
  body
    h1 Jade - node template engine
    #container.col
      if youAreUsingJade
        p You are amazing
      else
        p Get on it!
      p.
        Jade is a terse and simple
        templating language with a
        strong focus on performance
        and powerful features.
```

**[ Translated HTML Template ]**
```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Jade</title>
    <script type="text/javascript">
      if (foo) {
         bar(1 + 5)
      }
    </script>
  </head>
  <body>
    <h1>Jade - node template engine</h1>
    <div id="container" class="col">
      <p>You are amazing</p>
      <p>
        Jade is a terse and simple
        templating language with a
        strong focus on performance
        and powerful features.
      </p>
    </div>
  </body>
</html>
```

The following points are Jade's features.
  
* The file size is smaller. For example, you only have to write `body` instead of `<body></body>`. 
* It is same as CSS how to write `id` attribute and `class` attribute. 
* Indentatioin of lines has especial meanings.

At the viewpoint of maintainability, the third point is the most important one of them.  
In HTML, you can write the same template in the various formats.  
For example, the following templates are the same.  

**[ Template with Indentation ]**
```html
<!DOCTYPE html>
<html lang="en">
  <body>
    <h1>Sample</h1>
    <div>
      <p>This is a sample template</p>
    </div>
  </body>
</html>
```

**[ Template without Indentation ]**
```html
<!DOCTYPE html>
<html lang="en">
<body>
  <h1>Sample</h1>
  <div><p>This is a sample template</p></div>
</body></html>
```

This flexibility is sometimes useful.  
But it becomes hard to maintain the big templates in the future.  
With Jade format, which is limited, we can write templates with fixed quality.  

### 2.2. AngulasJS
[AngularJS][angularjs-link] is a MVC framework of JavaScript.  
It helps to change templates dynamically by JavaScript at the client side.  
It is easy to get data from servers by using services provided by AngularJS.  

As below is a sample template with AngularJS.  
For more information, please look at [AngularJS's guides](https://docs.angularjs.org/guide).

```html
<!doctype html>
<html ng-app>
  <head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
  </head>
  <body>
    <div>
      <label>Name:</label>
      <input type="text" ng-model="yourName" placeholder="Enter a name here">
      <hr>
      <h1>Hello {{yourName}}!</h1>
    </div>
  </body>
</html>
```

In AngularJS, we can register controllers, services and so on with your modules.  
And, we can use those by using DI (Dependency Injection).  

### 2.3. TypeScript
JavaScript is a very useful to develop web applications and used in various locations.  
In general, it is sometimes said that JavaScript is a **dynamically and weakly typed** language.  
It will cause to degrade maintainability of source codes.  

Therefore, alternative languages of JavaScript have been proposed.  
[TypeScript][typescript-link] is the famous one of them, which is developed by Microsoft.  
As below are the sample codes written by TypeScript. 
As you can see, in TypeScript, you can write scripts like statically languages such as Java.  

**[ TypeScript Code Sample ]**
```typescript
class Greeter {
    greeting: string;
    constructor(message: string) {
        this.greeting = message;
    }
    greet() {
        return "Hello, " + this.greeting;
    }
}

let greeter = new Greeter("world");

let button = document.createElement('button');
button.textContent = "Say Hello";
button.onclick = function() {
    alert(greeter.greet());
}

document.body.appendChild(button);
```

**[ Compiled JavaScript Code Sample ]**
```javascript
var Greeter = (function () {
    function Greeter(message) {
        this.greeting = message;
    }
    Greeter.prototype.greet = function () {
        return "Hello, " + this.greeting;
    };
    return Greeter;
}());
var greeter = new Greeter("world");
var button = document.createElement('button');
button.textContent = "Say Hello";
button.onclick = function () {
    alert(greeter.greet());
};
document.body.appendChild(button);
```

There is another advantage when you write scripts by TypeScript.  
When you read or write scripts, you may sometimes want IDE's help.  
In TypeScript, we can use Visual Studio as an IDE.  
IDEs will help junior developers to read or write scripts.  

### 2.4. Sass
[Sass][sass-link] stands for **Syntactically Awesome StyleSheet**.  
As below are Sass's features quoted from [Sass's documents](http://sass-lang.com/documentation/file.SASS_REFERENCE.html).  

As you can see, Sass is fully CSS compatible and has useful function CSS doesn't have.  
So, if there are no especial reasons not to use Sass, we should use Sass.  

> * Fully CSS-compatible  
> * Language extensions such as variables, nesting, and mixins  
> * Many useful functions for manipulating colors and other values  
> * Advanced features like control directives for libraries  
> * Well-formatted, customizable output  

For example, `@import` rule is one of Sass's advantages.  
We can allow one Sass file to import other Sass files.  
It helps us to divide style definition files by appropriate units.  

### 2.5. Package Manager
[npm][npm-link] is a package manager for [NodeJS][nodejs-link].  
NodeJS provides the environment to execute JavaScript on servers.  
By using this, we can use auto building tool such as `Gulp` or `Grunt`.  
You can get libraries registerd on `package.json` by executing the following command.  

```
npm install
``` 

[bower][bower-link] is a package manager for JavaScript libraries.  
We can manage 3rd party libralies such as `React`, `Angular` and so on. 
You can get libraries registerd on `bower.json` by executing the following command.   
(bower requires that Git is installed on your computer.)  

```
bower install
``` 

When you use 3rd party libralies written by JavaScript, IDEs can't help you.  
It is because that IDEs can't understand those libraries.  
To resolve this, we can use files with type definitions for JavaScript libraries.  
By using [Typings][typings-link], we can manage those type definition files.  
You can get type definition files registerd on `typings.json` by executing the following command.  

```
typings install
``` 

### 2.6. Auto Building
There are some processes to build your application.  
Processes are compiling Jade files, TypeScript files, Sass files, coping files to the output directory and so on.  
Those processes are automated by using [Gulp][gulpjs-link].  

Basically, to build your application, you only have to execute a command as below.

```
gulp build
``` 

## 3. Project Structure
As below is a primitive structure of a TypeScript project using AngularJS.  

**[ Project Structure ]**
```
[project]
│   .bowerrc
│   .gitignore
│   bower.json
│   gulpfile.js
│   package.json
│   typings.json
│
├───gulp
│   │   build.js
│   │   clean.js
│   │   constant.js
│   │   serve.js
│   │   watch.js
│   │   ...
│
└───src
    │   index.jade
    │
    ├───app
    │   │   app.ts
    │   │
    │   ├───classes
    │   │   │   index.ts
    │   │   │
    │   │   ├───[component or service name]
    │   │   │   │   index.ts
    │   │   │   │   [class name].ts
    │   │   │   │   ...
    │   │   │   ...
    │   │
    │   ├───components
    │   │    ├───[component name]
    │   │    │   │   conponent.ts
    │   │    │   │   controller.ts
    │   │    │   │   style.scss
    │   │    │   │   template.jade
    │   │    │   ...
    │   │
    │   ├───configs
    │   │   ├───[module name]
    │   │   │   │   xxx.ts
    │   │   │   │   yyy.ts
    │   │   │   │   ...
    │   │   │   ...
    │   │
    │   ├───constants
    │   │   │   index.ts
    │   │   │
    │   │   ├───[group name]
    │   │   │   │   index.ts
    │   │   │   │   xxx.ts
    │   │   │   │   yyy.ts
    │   │   │   │   ...
    │   │   │   ...
    │   │
    │   └───services
    │       ├───[service name]
    │       │   │   xxx.ts
    │       │   │   yyy.ts
    │       │   │   ...
    │       │   ...
    │
    └───assets
        │
        ├───data
        │   │
        │   ├───i18n
        │   │   │   locale-en.json
        │   │   │   locale-ja.json
        │   │   │   ...
        │   │   ...
        │
        ├───fonts
        │   │   ...
        │
        ├───images
        │   │   ...
        │
        └───styles
            │   app.scss
            │   ...
```


## 4. Directoy/File Information
As below are summary information of each directories and files.

**[ Directoy/File Information ]**
<table>
  <tr>
    <th>File</th>
    <th>Type</th>
    <th>Description</th>
  </tr>
  <tr>
    <td valign=top>.bowerrc</td>
    <td valign=top>file</td>
    <td>
      This is a config file of <code>Bower</code>.<br>
      Reference: <a href="http://bower.io/docs/config/">http://bower.io/docs/config/</a><br>
    </td>
  </tr>
  <tr>
    <td valign=top>.gitignore</td>
    <td valign=top>file</td>
    <td>
      This is a config file of <code>Git</code>.<br>
      you should ignore <code>node_modules</code> directory, <code>bower_components</code> directory and <code>typings</code> directory.<br>
      If you want, you can add other directories or files on <code>.gitignore</code>.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>bower.json</td>
    <td valign=top>file</td>
    <td>
      This is a manifest file of <code>Bower</code>.<br>
      For more information of <code>Bower</code>, please look at <strong>2.5. Package Manager</strong>.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>gulpfile.js</td>
    <td valign=top>file</td>
    <td>
      This is an entry point file of <code>Gulp</code><br>
      For more information of <code>Gulp</code>, please look at <strong>2.6. Auto Building</strong>.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>package.json</td>
    <td valign=top>file</td>
    <td>
      This is a manifest file of <code>npm</code>.<br>
      For more information of <code>npm</code>, please look at <strong>2.5. Package Manager</strong>.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>typings.json</td>
    <td valign=top>file</td>
    <td>
      This is a manifest file of <code>typings</code>.<br>
      For more information of <code>typings</code>, please look at <strong>2.5. Package Manager</strong>.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>gulp</td>
    <td valign=top>directory</td>
    <td>
      This directory contains <code>JavaScript</code> files for definition of <code>Gulp</code> tasks.<br>
      When you want to add a new <code>Gulp</code> task, you add a new <code>JavaScript</code> file here.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>gulp/build.js</td>
    <td valign=top>file</td>
    <td>
      JavaScript codes of <code>build</code> task are written in this file.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>gulp/clean.js</td>
    <td valign=top>file</td>
    <td>
      JavaScript codes of <code>clean</code> task are written in this file.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>gulp/constant.js</td>
    <td valign=top>file</td>
    <td>
      JavaScript codes of constans are defined in this file.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>gulp/serve.js</td>
    <td valign=top>file</td>
    <td>
      JavaScript codes of <code>serve</code> task are written in this file.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>gulp/watch.js</td>
    <td valign=top>file</td>
    <td>
      JavaScript codes of <code>watch</code> task are written in this file.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src</td>
    <td valign=top>directory</td>
    <td>
      This directory contains all of source codes and other resources.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/index.jade</td>
    <td valign=top>file</td>
    <td>
      This is a template file of top page.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app</td>
    <td valign=top>directory</td>
    <td>
      This is a root directory of your application.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/app.ts</td>
    <td valign=top>file</td>
    <td>
      This is an entry point file of your application.<br>
      In this file, you define an AngularJS's module.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/classes</td>
    <td valign=top>directory</td>
    <td>
      This directory contains definitions of TypeScript <code>Class</code>.<br>
      If neccesary, you can make sub directories here and put files into them.<br>
      <br>
      When you make sub directories, Each of them has to contain <code>index.ts</code> file.<br>
      In <code>index.ts</code>, you have to write references to other <code>.ts</code> files.<br>
      <br>
      (e.g.) sample of <code>fruits/index.ts</code><br>
      /// &lt;reference path="./apple.ts" /&gt;<br>
      /// &lt;reference path="./orange.ts" /&gt;<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/classes/index.ts</td>
    <td valign=top>file</td>
    <td>
      In this file, you have to write references to other <code>index.ts</code> in sub directories.<br>
      <br>
      (e.g.) sample of <code>index.ts</code><br>
      /// &lt;reference path="./fish/index.ts" /&gt;<br>
      /// &lt;reference path="./fruits/index.ts" /&gt;<br>
      /// &lt;reference path="./vegetable/index.ts" /&gt;<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/components</td>
    <td valign=top>directory</td>
    <td>
      This directory contains AngularJS's components.<br>
      When you add new components, you should make sub directories here.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/components/[components name]/component.ts</td>
    <td valign=top>file</td>
    <td>
      In this file, you define <code>angular.module().component()</code>.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/components/[components name]/controller.ts</td>
    <td valign=top>file</td>
    <td>
      In this file, you define <code>angular.module().controller()</code>.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/components/[components name]/template.jade</td>
    <td valign=top>file</td>
    <td>
      This is a template file for this component.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/components/[components name]/style.scss</td>
    <td valign=top>file</td>
    <td>
      This is a style definitions for this component.<br>
      When you define no styles, this file will be blank.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/configs</td>
    <td valign=top>directory</td>
    <td>
      This directory contains AngularJS's configs.<br>
      When you add new configs, you should make sub directories here.<br>
      <br>
      For example, you want to edit configuration of <code>angular-ui-router</code>, you should make <code>angular-ui-router</code> directory and put configuration script files there.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/constants</td>
    <td valign=top>directory</td>
    <td>
      This directory contains definitions of constants.<br>
      If neccesary, you can make sub directories here and put files into them.<br>
      <br>
      When you make sub directories, Each of them has to contain <code>index.ts</code> file.<br>
      In <code>index.ts</code>, you have to write references to other <code>.ts</code> files.<br>
      <br>
      (e.g.) sample of <code>country/index.ts</code><br>
      /// &lt;reference path="./apple.ts" /&gt;<br>
      /// &lt;reference path="./orange.ts" /&gt;<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/constants/index.ts</td>
    <td valign=top>file</td>
    <td>
      In this file, you have to write references to other <code>index.ts</code> in sub directories.<br>
      <br>
      (e.g.) sample of <code>index.ts</code><br>
      /// &lt;reference path="./fish/index.ts" /&gt;<br>
      /// &lt;reference path="./fruits/index.ts" /&gt;<br>
      /// &lt;reference path="./vegetable/index.ts" /&gt;<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/app/services</td>
    <td valign=top>directory</td>
    <td>
      This directory contains AngularJS's services.<br>
      When you add new services, you should make sub directories here.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/assets</td>
    <td valign=top>directory</td>
    <td>
      This directory contains asset files such as image files, font files, json data files and so on.<br>
      Assets files should be put in appropriate directories according to their file types.<br>
      <br>
      For example, if you want to put <code>pdf</code> files, you should add <code>pdf</code> directory here and put <code>pdf</code> files there.
    </td>
  </tr>
  <tr>
    <td valign=top>src/assets/data</td>
    <td valign=top>directory</td>
    <td>
      This directory contains json data files.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/assets/data/i18n</td>
    <td valign=top>directory</td>
    <td>
      This directory contains json data files for <a href="https://github.com/angular-translate/angular-translate">angular-translate</a>.<br>
      If necessary, you can add new <doce>locale-xx.json</code> files such as <code>locale-fr.json</code>, <code>locale-zh.json</code> and so on.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/assets/data/i18n/locale-en.json</td>
    <td valign=top>file</td>
    <td>
      This is a resource file for `angular-translate`.<br>
      This file is used for translating to English.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/assets/data/i18n/locale-ja.json</td>
    <td valign=top>file</td>
    <td>
      This is a resource file for `angular-translate`.<br>
      This file is used for translating to Japanese.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/assets/fonts</td>
    <td valign=top>directory</td>
    <td>
      This directory font files.<br>
      If neccesary, you can make sub directories here.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/assets/image</td>
    <td valign=top>directory</td>
    <td>
      This directory contains image files.<br>
      If neccesary, you can make sub directories here.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/assets/styles</td>
    <td valign=top>directory</td>
    <td>
      This directory contains style definition files(<code>.scss</code>).<br>
      If neccesary, you can make sub directories here.<br>
    </td>
  </tr>
  <tr>
    <td valign=top>src/assets/styles/app.scss</td>
    <td valign=top>file</td>
    <td>
      This is a root file of all style definiton files.<br>
      If neccesary, you can add new <code>.scss</code> files and append <code>@import</code> statements in this file.<br>
    </td>
  </tr>
</table> 

## 5. Jade Viewpoint
### 5.1. Separation of Styles and Scripts
Basically, you can write css codes and JavaScript codes in `.jade` files.  
But, from the viewpoint of maintainability, it is believed that `.jade` files should not contain any css codes or JavaScript codes.  
Because of this practice, in `.jade` files, you must write no css codes and JavaScript codes but only links to files those codes written in.  

### 5.2. Root Element
To avoid conflict between style definitions, you must set a `div` tag with `id` attribute to a root element in each components.  
By this, style definitions in a components are not affected by ones in the other components.   

**[NG: `div#id` Not Defined as Root Element]**
```jade
h2 Sample Page
p This is a sample page.
```

**[OK]**
```jade
#sample-page
  h2 Sample Page
  p This is a sample page.
```

## 6. TypeScript Viewpoint
### 6.1. Type Definition
In TypeScript, you can omit type definitions.  
But variables without type definitions are defined as `any` type.  
To get benefits from IDE, you have to define the type except `any`.  

**[NG1: Type Not Defined]**
```typescript
var i = 0;
```

**[NG2: Type `any` Defined]**
```typescript
var i: any = 0;
```

**[OK]**
```typescript
var i: number = 0;
```

### 6.2. Class Definition
You can define `Class` in TypeScript.  
Basically, you can write more than two classes in one .ts file.  
To improve maintainability, you must write only one class in one .ts file.  

**[TypeScript Class Sample]**
```typescript
class Person {
  constructor(private name:string, private age:number) {
  }
  
  public getName(): string {
    return this.name;
  }
  
  public getAge(): number {
    return this.age;
  }
  
  public isAdult(): boolean {
    var result: boolean = false;
    if (this.age >= 20) {
      result = true;
    }
    return result;
  }
}
```

## 7. AngularJS Viewpoint
### 7.1. Modularization
In AngularJS, you have to define `angular.module(moduleName, dependencies)` on your application.  
If a part of your application is believed to have high reusability, you can separate it from the originl module.  
For example, it may be possible that you separate your authentication service from the original module and define it as another module.

When you define some modules, you make sub directories for each modules and put files in each sub directories.

**[ Project Structure with 2 Modules ]**
```
[project]
│   ...
│
└───src
    │   index.jade
    │
    ├───app
    │   │   
    │   ├───auth
    │   │   │
    │   │   ├───app.ts    # angular.module('SampleProject.Auth', dependencies);
    │   │   │
    │   │   ├───classes
    │   │   │   │   ...
    │   │   │
    │   │   ├───components
    │   │   │   │   ...
    │   │   │
    │   │   ├───configs
    │   │   │   │   ...
    │   │   │
    │   │   ├───constants
    │   │   │   │   ...
    │   │   │
    │   │   └───services
    │   │       │   ...
    │   │
    │   └───main
    │       │
    │       ├───app.ts    # angular.module('SampleProject', dependencies);
    │       │
    │       ├───classes
    │       │   │   ...
    │       │
    │       ├───components
    │       │   │   ...
    │       │
    │       ├───configs
    │       │   │   ...
    │       │
    │       ├───constants
    │       │   │   ...
    │       │
    │       └───services
    │           │   ...
    │
    └───assets
        │   ...
```

### 7.2. Component Based Application
In [AngularJS's guides](https://docs.angularjs.org/guide/component), it is said as below. 

>In Angular, a Component is a special kind of directive that uses a simpler configuration which is suitable for a component-based application structure.  
>
>This makes it easier to write an app in a way that's similar to using Web Components or using Angular 2's style of application architecture.  

So, you should develop UI components by using not AngularJS's `directive` but `component`.  
The sample codes are as below.  
You can use this component to write `sample-coponent` tag on `index.jade` or other templates.

**[AngularJS Component Sample]**  
_/app/components/sample-cpponent/component.ts_
```typescript
module SampleProject {
  export class SampleComponent {
    templateUrl: string = '/templates/app/components/sample-component/template.html';
    controller: string = 'SampleConponentController';
    controllerAs: string = '$ctrl';
  }
  angular.module('SampleProject').service('sampleComponent', new SampleComponent());
}
```
_/app/components/sample-cpponent/controller.ts_
```typescript
module SampleProject {
  export class SampleConponentController {
  }
  angular.module('SampleProject').component('SampleConponentController', SampleConponentController);
}
```
_/app/components/sample-cpponent/template.jade_
```jade
#sample-component
  p This is a sample content.
```
_/app/components/sample-cpponent/style.scss_
```sass
#sample-component {
  color: #ff0000;
}
```

### 7.3. Dependency Injection
When you create an AngularJS service by TypeScript, you can use other services by setting it the arguments of constructor.  
As below are sample codes of a service using `$http` service.  

**[AngularJS DI Sample]**
```typescript
module SampleProject {
  export class PersonService {
    constructor(public $http: ng.IHttpService) {
    }
    
    public getList(): ng.IPromise<any> {
      return this.$http.get('http://localhost/data/person').then(
        function(response: any) {
          var result = [];
          if (response.data != undefined) {
            result = response.data;
          }
          return response.data;
        }
      );
    }
  }
  angular.module('SampleProject').service('PersonService', PersonService);
}
```

In general, it is said AngularJS's DI has weakpoints.  
If you minify your JavaScript codes, AngularJS's DI will not work.
It is because characters of constructor's arguments are replaced to shorter characters and AngularJS's DI does not work.  
For exsample, if `$http` is replaced to `h`, this class will not be able to use `$http` service.  

To avoid this trouble, `ngAnnotate` is used in the sample project.  
`ngAnnotate` is an useful library which appends JavaScript codes for AngularJS's DI automatically.  
In the sample project, `gulp-ng-annotate` is automatically executed when applicationin is built.
So, you do not have to mind AngularJS's minifiation torubles.

### 7.4. Controllers
In this section, we discuss about AngularJS's controllers.

#### 7.4.1. Thin Controller
In general, AngularJS's controllers tend to become fatter and fatter.  
So, you should extract the following codes from your controllers.  
Those logic should be defined as AngularJS's services.  

1. Logic which accesses external resources
2. Business logic independent from templates

#### 7.4.2. Global Variables
In some cases, it may be needed that some values are shared in controllers.  
To resolve this, it may be said that you should use `$rootScope` service.  
But this solution is said to be bad.  

In AngularJS, values exposed in `$rootScope` are visible in all templates, controllers, services and so on.  
If using such values in many places, a lot of troubles will be caused.  
To avoid troubles, you should expose values in not `$rootScope` but your own service.  

## 8. Sass Viewpoint
### 8.1. Root file
`/src/assets/styles/app.scss` is a root of all scss files.  
This file must contain style definition affecting all components.  
In other words, you must separate style definitions affecting only specified components from `app.scss`.  

When you make another scss file, you can use it by appending `@import` statement to `app.scss`.  
For example, when you want to use Foundation, you should append the following statement.  

```sass
@import '../../bower_components/foundation/scss/foundation';
```

### 8.2. Style Conflict
In CSS, style definitions are overwritten by the following same tag's definition.  
For example, when you write the follwing statements in your .scss file, characters between `h2` tags are colored by not black but red.  
In this case, it is said the first style definition of `h2` tag is overwritten.  

```sass
h2 {
  color: #000000;
}

h2 {
  color: #ff0000;
}
```

So, you must append `id` attribute to tags and style definitions.  
Appending `id` attribute, you can avoid conflict between each style definitions.  

For example, when you write the follwing statements in your .scss file, characters between `h2#black` tags are colored by black and characters between `h2#red` tags are colored by red.  

```sass
h2#black {
  color: #000000;
}

h2#red {
  color: #ff0000;
}
```

## Z. Links
* [Jade - Template Engine][jade-link]
 
* [AngularJS — Superheroic JavaScript MVW Framework][angularjs-link]

* [TypeScript - JavaScript that scales.][typescript-link]

* [Sass: Syntactically Awesome Style Sheets][sass-link]

* [Node.js][nodejs-link]

* [npm][npm-link]

* [Bower][bower-link]
 
* [GitHub - typings/typings: The TypeScript Definition Manager][typings-link]

* [gulp.js - the streaming build system][gulpjs-link]

<!--- HTML Link Definitions Section:begin --->
<!--- Alphabetical Order --->
[angularjs-link]:https://angularjs.org/
[bower-link]:http://bower.io/
[gulpjs-link]:http://gulpjs.com/
[jade-link]:http://jade-lang.com/
[nodejs-link]:https://nodejs.org/
[npm-link]:https://www.npmjs.com/
[sass-link]:http://sass-lang.com/
[typescript-link]:https://www.typescriptlang.org/
[typings-link]:https://github.com/typings/typings
<!--- HTML Link Definitions Section:end --->