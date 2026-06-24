@echo off
echo ============================================
echo   Compiling Secret Number Game...
echo ============================================
javac Card.java Game.java SecretNumberGame.java
if %errorlevel% neq 0 (
    echo [ERROR] Compilation failed!
    pause
    exit /b %errorlevel%
)

echo.
echo ============================================
echo   Launching Secret Number Game...
echo ============================================
java SecretNumberGame
pause
