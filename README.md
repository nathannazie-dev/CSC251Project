# CSC251 Programming Project

## Digital Clock with Multiple Time Zones

A Java Swing application that displays the current time in different time zones around the world.

### Features

- **Real-time clock updates**: Updates every second
- **Multiple time zones**: Displays time for 8 major time zones:
  - Eastern Time (New York)
  - Central Time (Chicago)
  - Mountain Time (Denver)
  - Pacific Time (Los Angeles)
  - Greenwich Mean Time (London)
  - Central European Time (Paris)
  - Japan Standard Time (Tokyo)
  - Australian Eastern Time (Sydney)

- **Clean GUI**: Dark-themed interface with color-coded time displays
- **24-hour format**: Shows time in HH:mm:ss format

### How to Compile and Run

```bash
# Compile
javac DigitalClock.java

# Run
java DigitalClock
```

### Requirements

- Java 8 or higher
- No external dependencies (uses standard Java Swing library)

### Project Structure

```
CSC251Project/
├── DigitalClock.java    # Main application file
└── README.md            # Project documentation
```

### Implementation Details

- Uses Java's `java.time` API for timezone handling
- Implements `Swing` for GUI components
- `Timer` class schedules updates every 1000ms (1 second)
- `ZonedDateTime` handles timezone conversions automatically

### Author

Nathan Nazie

### License

MIT License
