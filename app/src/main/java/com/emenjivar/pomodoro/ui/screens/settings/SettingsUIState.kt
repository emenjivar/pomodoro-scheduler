package com.emenjivar.pomodoro.ui.screens.settings

import androidx.compose.ui.graphics.Color
import com.emenjivar.pomodoro.data.model.StructTime
import kotlinx.coroutines.flow.StateFlow

class SettingsUIState(
    val colorTheme: StateFlow<Color>,
    val workTime: StateFlow<Long>,
    val restTime: StateFlow<Long>,
    val structTime: StateFlow<StructTime>,
    val enableSound: StateFlow<Boolean>,
    val enableVibration: StateFlow<Boolean>,
    val enableAutoPlay: StateFlow<Boolean>,
    val enableKeepScreenOn: StateFlow<Boolean>,
    val loadModalTime: (isPomodoro: Boolean) -> Unit,
    val onInputChange: (digit: Int) -> Unit,
    val onBackSpace: () -> Unit,
    val onSaveTime: (isPomodoro: Boolean) -> Unit,
    val onEnableSound: (Boolean) -> Unit,
    val onEnableVibration: (Boolean) -> Unit,
    val onEnableAutoPlay: (Boolean) -> Unit,
    val onEnableKeepScreenOn: (Boolean) -> Unit
)