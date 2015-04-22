#开闭原则  
程序应当对扩展开放，对修改关闭。  
在不改变其他模块的情况下自由增加新功能。  

开闭原则(Open Closed Principle,OCP)是指"软件实体应当对扩展开放，对修改关闭(Software entities  
should be open for extension, but closed for modification)"。  
“对于扩展开放的”意味着模块的行为是可以扩展的。“对于修改时封闭的”对模块行为进行扩展时，不必改动模块的源代码或者二进制代码。
我认为开闭原则从软件系统的角度来说：软件系统中包含的各种功能组件（例如菜单(menu)、模块(module)、类(Classes)以及功能（Functions)等等)  
应该在不修改原有代码的基础上，添加新功能。同时，对于经常发生变化的有关值，可以进行封装。至于开闭原则中的”开“，可以认为对于组件功能的扩展是开放的，  
是允许对其进行功能扩展的。开闭原则的”闭“，可以认为对于原有代码的修改时关闭的，即不需要改动原有的代码。
简而言之，我们可以把开闭原则理解成--可以根据需求随意增加新的类，但是不要修改原有的类。




可扩展性、可维护性、可靠性



Open Close Principle  
software should be open for extension and closed to modification  
so it's easy to add new function without changing other modules.  