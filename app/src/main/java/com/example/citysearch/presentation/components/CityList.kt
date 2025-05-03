package com.example.citysearch.presentation.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.citysearch.R
import com.example.citysearch.domain.model.City

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CityList(
    groupedCities: Map<Char, List<City>>,
    isLoading: Boolean,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp)
    ) {
        AnimatedVisibility(
            visible = isLoading, enter = fadeIn(), exit = fadeOut()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            }

        }

        if (!isLoading && groupedCities.isEmpty()) {
            Text(
                text = "No cities found",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .align(Alignment.Center),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        LazyColumn(
            modifier = Modifier.drawBehind {
                val lineX = 70.dp.toPx() / 2f
                drawLine(
                    color = Color.LightGray,
                    start = Offset(lineX, 0f),
                    end = Offset(lineX, size.height - 5.dp.toPx()),
                    strokeWidth = 1.dp.toPx(),
                )
            }) {
            groupedCities.forEach { (letter, cities) ->
                item {
                    GroupHeader(letter = letter.toString())
                }

                items(cities.size) { index ->
                    val city = cities[index]

                    CityItem(
                        city = city,
                    )
                }

                if (letter == groupedCities.keys.last()) {
                    item {
                        Box(
                            modifier = Modifier
                                .width(70.dp)
                                .padding(top = 30.dp)
                                .height(20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(15.dp)
                                    .clip(CircleShape)
                                    .background(colorResource(R.color.bgLightGreyFrame))
                            )
                        }
                    }
                }
            }
        }

    }
}