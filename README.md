# SoftwareLab2
گام 1:
| Row  | Change Location | Change Title | Description |
| --------| ------------ | ------------------- | ----------- |
| 1  | Main Class  | 	Adding Selection for Phone Order | Adding conditions for selecting phone order method in the main function|
| 2  | Main Class  | 	Utilizing PhoneOrderService | Utilizing PhoneOrderService for phone order registration and payment |
| 3  | Order Service  | Adding Phone Payment Function | A void function named phoneOrderPayment has been added |
| 4  | Order Service  | Adding Phone Order Registration Function | a void function named phoneOrderRegister has been added |

مجموع تعداد تغییرات: 4

--------------------------------------------------------------------------------------------------
گام 2:

| شماره اصل  | موارد نقض | موارد تحقق | اصل |
| --------| ------------ | ------------------- | ----------- |
| 1  | کلاس Main نقض این اصل را انجام می‌دهد. زیرا این کلاس مسئولیت‌های زیادی شامل ورود کاربر، مدیریت سفارش و انتخاب روش‌های پرداخت را بر عهده دارد و بهتر است که آن را به کلاس‌های متمایزی تقسیم کنیم تا وظایف مختلف را مدیریت کنند.  | 	اینترفیس OrderService و کلاس‌های implemented شده آن این اصل را رعایت می‌کنند، زیرا هر کلاس یا اینترفیس وظایف خاص خودش را در رابطه با ثبت سفارش و روش‌های پرداخت انجام می‌دهد.|  Single Responsibility|
| 2  | کلاس Main هروقت که نیاز به افزودن یک سفارش جدید باشد باید تغییر کند. بهتر است این کلاس طوری باشد که بدون نیاز به تغییر مستقیم امکان گسترش ویژگی‌ها را داشته باشد و ممکن است این ویژگی را نقض کند.  | 	کد ما قابلیت افزودن کلاس PhoneOrderService را بدون نیاز به تغییر مستقیم کلاس‌های موجود دارد درنتیجه این اصل را رعایت می‌کند. | Open-Close Principle (OCP) |
| 3  | مورد نقض خاصی وجود ندارد.  | پیاده‌سازی کد شامل اضافه کردن سرویس سفارشات مختلف بدون ایجاد تداخل در کد‌های دیگر میباشد و به نوعی این اصل را رعایت میکند. | Liskov Substitution Principle |
| 4  | نقضی وجود ندارد.  | اینترفیس OrderService این اصل را رعایت می‌کند، زیرا وظایف مربوط به سفارش را به روش‌های مختلف در رابط‌های مختلف تقسیم کرده است. | Interface Segregation Principle |
| 5  | کلاس Main به طور مستقیم با پیاده‌سازی‌ سرویس سفارشات ارتباط برقرار می‌کند. می‌توان از factory و یا ایجاد dependency برای حل این مشکل استفاده کرد.  | استفاده از اینترفیس‌ها (OrderService)  به جای پیاده‌سازی‌های دیگر، به نوعی تحقق این اصل را نشان می‌دهد. | Dependency Inversion Principle |

راه حل:

| شماره اصل  | راه حل | علت نقض | اصل مربوطه |
| --------| ------------ | ------------------- | ----------- |
| 1  | پیاده‌سازی کلاس‌های متمایز برای ورود کاربر، مدیریت سفارش و انتخاب روش‌های پرداخت  | 	مسئولیت و وظایف متعدد کلاس Main | Single Responsibility|
| 2  | پیاده‌سازی یک ساختار انعطاف‌پذیرتر برای مدیریت انواع مختلف سفارش بدون اصلاح کد موجود | 	اصلاح و تغییر مستقیم کلاس Main | Open-Close Principle (OCP) |
| 3  | ایجاد Dependency یا استفاده از factory patterns  | وجود coupling برای برخی سرویس‌ها در کلاس Main | Dependency Inversion Principle |
