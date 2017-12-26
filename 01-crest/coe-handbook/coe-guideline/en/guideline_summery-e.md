## Title of the guideline
####"The guideline of developing and maintaining global standardized system"

## Significance of the guideline
　Strengthening standardization, commonality of system and program structure and process, while leaving local requirements for the system developed globally,
　developing, maintaining and operating a system which can respond flexibly to changes of business requirements and system requirements resulting from sudden change of business environment,
　This guideline proposes the view for materializing the concept of the above-mentioned global standardized system.


## Purpose of the guideline
　This guideline is aimed to make persons involved in each phase of works associated with a system
 easy to start actual works in each phase for developing, maintaining and operating the system based on a concept 
 and easy to tackle them efficiently under common recognition.
　Knowledge and view used as introduction for the above are made to understand.  


## Target fields of the guideline
　This guideline is aimed at  business activities in a mission critical system of a company which advances global expansion of business. 
 
## Target system ranges of the guideline
 　This guideline is aimed at architectures of the range of the following in a system. 
 
* Middleware architecture  
　What is the base for creating a system, and specifies software configurations and directions for an execution system and a development/maintenance (domain independent). 

* Application architecture  
　What specifies structure of an application and methods of operation based on   restrictions and requirements for every domain.

* Operation process  
　What specifies process, organization and development environment for development, operatio, and maintenance of a system for every domain.


## Target readers of the guideline
　This guideline is targeted at the following persons concerned in a mission critical system of a company which advances global expansion of business.
 
* Person who defines requirements
* Designer
* Developer
* Operator


## What will be able to by reading the guideline
　If you read this guideline, you can realize the items listed bellow.
 
* You can understand view of new architecture, standard interface, and application development method, in order to realize a system which is globally expanded system, but has different contents and sequences of a business processing for every region, and in order to minimize an extent of an impact of repairing or obstacle.
* You can understand view of Continuous Integration, in order to carry out efficiently agile development furthered at high speed, checking and verifying requirements when requirements have not been decided yet at the start time.
* You can understand view of system resource management, in order to develop, maintain and operate a system also corresponding to local requirements, following the standard specified globally. It contains view of clarifying global and local responsibility range, and view of increasing efficiency and reliability of works in management of system components.



## Directions for the guideline
　This guideline is not a design specification or a tutorial. This is the document which summarized a view and approach for developing, maintaining and operating global expanded system and application.
　It is assumed that persons involved in each phase of works associated with a system read this guideline before starting their works or at the very beginning of their works. 
 　This guideline includes the following contents. 
 
* **System Renovation：**
 * Overview　　  
     *  You can understand the view of a system renovation for renovating a large scale system continuously and gradually, minimizing a change risk. 
     *  You can understand the approach for renovating a system gradually in accordance with three processes (Reform, Refine, Renovation). By doing these processes, it attains renovating a system, with clarifying improvement effects in a business user, and a developer/maintenance person.
  * Merit　　  
     *  After understanding processes and effects of system renovation, you can discern a required process.



* **The Loosely-coupled Architecture：**
  * Overview
     * The system comprises elements that implement the UI for business logic, elements that implement specific processing logic, and elements that store data on the basis of a data model. You can understand the loosely-coupled architecture, in which those three types of elements are combined to construct systems and business logic.
     * By using the loosely-coupled architecture, you can all do implementation, testing, and deployment in units of loosely-coupled elements. 
     * It is also easy to minimize the scope of effects from system changes and failures and to identify the scope of effects.
  * Merit
  	*  In the phase of designing and implementing in new development or repairing, after understanding basic principle of a new architecture well, you can start designing and implementing modules of a system based on the new architecture.


* **Using the Standard Interface：**
  * Overview
     * You can understand approach of using a standard interface for connection of the constituent components of a system and for interworking with other systems
     * You use a REST-ful interface based on HTTP protocol as the standard interface. 
     * By using a standard interface, you do not need to be conscious of the implementation method of individual elements. There is no effect on other modules due to repairing, exchanging and adding of a module. In addition, if a standard interface is applied by the system which applies a loosely-coupled architecture, it is more effective.
     
  * Merit　　  
     * In the phase of designing and implementing in new development or repairing, after understanding a feature of a standard interface well, you can start designing and implementing modules in a system using a standard interface, and an external system which calls those modules with that standard interface.


  
* **Application Development using a Batch Framework：**
  * Overview
     * You can understand the view of the application development using the batch framework which performs batch processing for realizing the system based on a loosely-coupled architecture, and it manages. A batch framework offers the common functions which are needed when realizing batch processing, such as execution control, status management, input and output, and logging.
     * By using a batch framework, development of a common code of a non-domain is unnecessary to a developer. Therefore, you can be concentrated only on development of essential processing of the business depending on a domain.
   　
  * Merit
     * In the phase of designing and implementing in new development or repairing, after understanding a feature of a batch framework, you can start designing and implementing an application by utilizing feature functions of a batch framework.

   
* **Continuous Integration：**
  * Overview
     * You can understand the view of the Continuous Integration (CI) by building for shortening, and repetition of a test during the quality improvement in software development, and the period.
     * In order to carry out Continuous Integration effectively, unified management and visualization of project activities, efficient source code control, building and test automation are important. For realizing them, you can understand the combination of the ticket managerial system, a version control system, a build tool, a test tool and CI tool, and the view of practical use. 
     * In order to carry out Continuous Integration effectively, it is important to perform a test continuously. You can understand the view of a test.
  * Merit
     * In the phase of designing, implementing, building, deploying and testing in new development or repairing, after understanding a view of Continuous Integration well, you can start efficiency of the work of development and repairing of a system and quality improvement.

  
* **System Resource Management：**
  * Overview
     * You can understand the view of system resource management, resource visualization and control for developing and employing the system also corresponding to local requirements, following the standard specified globally.
     * By system resource management, in development and repair of a system, the reusability of a component is made high and raise productivity of system development and repair.
  * Merit
     * In the phase of building, deploying and testing in new development or repairing, and in the phase of product deploying and maintaining in releasing, after understanding well view of managing the system also corresponding to local requirements, following the standard specified globally, you can start developing, maintaining and operating a system.


* * *

## <a name="guideline-contents">Table of contents</a>
##### [1. System Renovation](guideline_system-renovation-e.md)    
[1.1. Introduction](guideline_system-renovation-e.md#init)    
[1.2. Purpose](guideline_system-renovation-e.md#purpose)    
[1.3. Policy](guideline_system-renovation-e.md#policy)    
[1.4. View of system renovation](guideline_system-renovation-e.md#renovation)    
[1.5. Details of renovation process](guideline_system-renovation-e.md#r3)    
[1.6. Relation with other sections](guideline_system-renovation-e.md#others)    


##### [2. The Loosely-coupled Architecture](guideline_loosely-coupled-architecture-e.md)
[2.1. Introduction](guideline_loosely-coupled-architecture-e.md#init)    
[2.2. Purpose](guideline_loosely-coupled-architecture-e.md#purpose)    
[2.3. Policy](guideline_loosely-coupled-architecture-e.md#policy)    
[2.4. Basic principles of the architecture](guideline_loosely-coupled-architecture-e.md#archi)    
[2.5. Loosely-coupled elements](guideline_loosely-coupled-architecture-e.md#module-design)    

##### [3. Using the Standard Interface](guideline_unified-standard-interface-e.md)
[3.1. Introduction](guideline_unified-standard-interface-e.md#init)    
[3.2. Purpose](guideline_unified-standard-interface-e.md#purpose)    
[3.3. Policy](guideline_unified-standard-interface-e.md#policy)   
[3.4. The standard interface](guideline_unified-standard-interface-e.md#standard-if)    
[3.5. Implementation policy for the standard interface](guideline_unified-standard-interface-e.md#if-impli)    

##### [4. Application Development using a Batch Framework](guideline_batch-framework-e.md)
[4.1. Introduction](guideline_batch-framework-e.md#init)    
[4.2. Purpose](guideline_batch-framework-e.md#purpose)    
[4.3. Policy](guideline_batch-framework-e.md#policy)    
[4.4. The view of using a batch framework](guideline_batch-framework-e.md#batchFW-concept)    
[4.5. The view of the application development using a batch framework](guideline_batch-framework-e.md#batchFW-ap)    

##### [5. Continuous Integration](guideline_continuous-integration-e.md)
[5.1. Introduction](guideline_continuous-integration-e.md#init)    
[5.2. Purpose](guideline_continuous-integration-e.md#purpose)    
[5.3. Policy](guideline_continuous-integration-e.md#policy)    
[5.4. View of Continuous Integration](guideline_continuous-integration-e.md#ci-archi)    
[5.5. Enforcement policy of Continuous Integration](guideline_continuous-integration-e.md#ci-impli)    
[5.6. Test policy](guideline_continuous-integration-e.md#test)        

##### [6. System Resource Management](guideline_system-resource-mgt-e.md)
[6.1. Introduction](guideline_system-resource-mgt-e.md#init)    
[6.2. Purpose](guideline_system-resource-mgt-e.md#purpose)    
[6.3. Policy](guideline_system-resource-mgt-e.md#policy)    
[6.4. View of system resource management](guideline_system-resource-mgt-e.md#system-resource)    
[6.5. View of resource visualization](guideline_system-resource-mgt-e.md#resource-vs)    
[6.6. View of control](guideline_system-resource-mgt-e.md#control)    

* * *
[**Glossary**](guideline_glossary-e.md)     
[**Cautions**](guideline_caution-e.md)




