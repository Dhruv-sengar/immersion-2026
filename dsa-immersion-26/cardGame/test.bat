@echo off
echo ============================================
echo   Compiling Game Tests...
echo ============================================
javac Card.java Game.java GameTest.java
if %errorlevel% neq 0 (
    echo [ERROR] Test compilation failed!
    pause
    exit /b %errorlevel%
)

echo.
echo ============================================
echo   Running Game Tests...
echo ============================================
java GameTest
pause
